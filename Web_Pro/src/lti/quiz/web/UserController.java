package lti.quiz.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import lti.quiz.bean.ForgetBean;
import lti.quiz.bean.LoginBean;
import lti.quiz.bean.RegistrationBean;
import lti.quiz.service.UserService;
import lti.quiz.service.UserServiceImpl;

@WebServlet("/user.quiz")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService service;

	@Override
	public void init() throws ServletException {
		service = new UserServiceImpl();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String referer = request.getHeader("referer");
		// Creates a fresh new session in the server
		// session id found in request header
		// Otherwise old session identified by id in request header
		HttpSession session = request.getSession();

		if (request.getParameter("logout") != null) {

			// user request to logout
			session.invalidate(); // destroying session
			response.sendRedirect("index.jsp"); // send user to login page

		} else if (referer.contains("index")) {
			// Request is for login authentication
			LoginBean login = new LoginBean();
			login.setEmail(request.getParameter("email"));
			login.setPassword(request.getParameter("password"));
			RegistrationBean user = service.authenticate(login);

			if (user != null) {
				// Login successful
				session.setAttribute("USER", user);
				response.sendRedirect("dashboard.jsp");
			} else {
				// Login failed
				response.sendRedirect("index.jsp?exist=yes");
			}

		} else if (referer.contains("registration")) {

			// Request is for new user registration
			RegistrationBean register = new RegistrationBean();

			register.setEmail(request.getParameter("email"));
			register.setPassword(request.getParameter("password"));
			register.setAnswer(request.getParameter("answer"));

			if (service.register(register)) {
				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("registration.jsp?exist=yes");
			}

		} else if (referer.contains("forgetpwd")) {

			// Request is for user validation
			ForgetBean forget = new ForgetBean();
			forget.setEmail(request.getParameter("email"));
			forget.setAnswer(request.getParameter("answer"));

			if (service.validate(forget)) {
				session.setAttribute("EMAIL", forget.getEmail());
				response.sendRedirect("change.jsp");
			} else {
				response.sendRedirect("forgetpwd.jsp");
			}
		} else {
			LoginBean change = new LoginBean();

			change.setPassword(request.getParameter("password"));
			change.setEmail((String) session.getAttribute("EMAIL"));
			if (service.update(change)) {
				session.removeAttribute("EMAIL");

				response.sendRedirect("index.jsp");
			} else {
				response.sendRedirect("change.jsp");

			}
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
