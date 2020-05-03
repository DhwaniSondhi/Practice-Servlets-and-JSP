package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AddServlet extends HttpServlet{

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		
	
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		
		Cookie cookie=new Cookie("sum", String.valueOf(num1+num2));
		
		response.addCookie(cookie);
		response.sendRedirect("square");
		/*
		 * RequestDispatcher dispatcher=request.getRequestDispatcher("square");
		 * dispatcher.forward(request, response);
		 */
	}
}
