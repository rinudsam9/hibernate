package lti.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;


public class LogFilter implements Filter {
	  protected FilterConfig fConfig;

	public void init(FilterConfig fConfig) throws ServletException {
		this.fConfig = fConfig;
	}


	
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// place your code here
		System.out.println("Visit Time : " + new Date());
		System.out.println("Visitor Ip : " + request.getRemoteAddr());


		// pass the request along the filter chain

		PrintWriter out = response.getWriter();
		long startTime = System.currentTimeMillis();
	    chain.doFilter(request, response);
	    long elapsed = System.currentTimeMillis() - startTime;
	    String name = "servlet";
	    if (request instanceof HttpServletRequest) {
	      name = ((HttpServletRequest) request).getRequestURI();
	    }

	    fConfig.getServletContext().log(name + " took " + elapsed + " ms");
	  }
	
	
	
}
