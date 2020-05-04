package org.practice;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FilterId
 */
@WebFilter("/addPerson")
public class FilterId implements Filter {

   
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		int id=Integer.parseInt(req.getParameter("id"));
		System.out.println("in ID filter");
		if(id>0) {
			chain.doFilter(request, response);
		}else {
			response.getWriter().println("Invalid Input");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
