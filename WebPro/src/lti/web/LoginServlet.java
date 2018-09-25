package lti.web;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramUser = request.getParameter("userid");
		String paramPass = request.getParameter("password");
		
		ServletConfig config = getServletConfig();
		String initUser = config.getInitParameter("User");
		String initPass = config.getInitParameter("Pass");
		
		if(paramUser.equals(initUser) && paramPass.equals(initPass) ) {
			response.sendRedirect("hello.jsp");
		}else
		{
			response.sendRedirect("login.jsp?invalid=yes");
		}
		
	     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
