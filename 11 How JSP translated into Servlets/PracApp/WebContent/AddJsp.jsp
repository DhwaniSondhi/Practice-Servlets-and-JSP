<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
	
	<%!
	//declaration
		int value=1;
	%>
	<%
	//scriplet
	int num1=Integer.parseInt(request.getParameter("num1"));
	int num2=Integer.parseInt(request.getParameter("num2"));
	int sum=num1+num2;
	out.println("Output "+sum);
	%>
	<p><%= "Hi"%></p>
</body>
</html>