<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="java.util.Random,java.sql.Statement"%>
	
<%@ page import ="java.util.List" %>
<%@ include file="Header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!String name = "Dhwani";%>
	<h1>Hello World</h1>
	<%
		out.println(7 + 5);
	%>
	<p> My Name is <%=name %></p>
</body>
</html>