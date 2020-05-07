package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet{

	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		int sum=num1+num2;
		try {
			PrintWriter wrt=response.getWriter();
			wrt.println("result:"+sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
