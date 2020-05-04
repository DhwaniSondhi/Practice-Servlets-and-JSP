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
public class FilterName implements Filter {

   
	public void destroy() {
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest)request;
		String name=req.getParameter("name");
		System.out.println("in name filter");
		if(name.trim().length()>2) {
			chain.doFilter(request, response);
		}else {
			response.getWriter().println("Name should be greater than 2");
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
