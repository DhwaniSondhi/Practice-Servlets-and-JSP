package com.javaTut;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name=req.getParameter("userName");
		String password=req.getParameter("password");
		
		if(name.trim().equalsIgnoreCase("root")  &&  password.trim().equalsIgnoreCase("root")) {
			HttpSession session=req.getSession();
			session.setAttribute("uName", name.trim());
			resp.sendRedirect("Welcome.jsp");
		}else {
			resp.sendRedirect("Login.jsp");
		}
	}
}
