package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Optional;

import javax.servlet.ServletConfig;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		
		ServletConfig config=getServletConfig();
		response.getWriter().println("Hi "+config.getInitParameter("name"));
		Optional<Cookie> sum=Arrays.stream(request.getCookies()).filter(cookie->cookie.getName().equalsIgnoreCase("sum")).findAny();
		if(sum.get()!=null) {
			int num=Integer.parseInt(sum.get().getValue());
			PrintWriter wrt=response.getWriter();
			wrt.println("Square is:"+(num*num));
		}
		
	}
}
