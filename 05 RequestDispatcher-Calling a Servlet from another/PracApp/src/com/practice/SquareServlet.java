package com.practice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SquareServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException  {
		int num=(int) request.getAttribute("sum");
		PrintWriter wrt=response.getWriter();
		wrt.println("Square is:"+(num*num));
	}
}
