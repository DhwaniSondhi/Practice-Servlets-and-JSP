<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Expires", "0");
		if (session.getAttribute("uName") == null) {
			response.sendRedirect("Login.jsp");
		}
	%>
	<iframe width="420" height="315"
		src="https://www.youtube.com/embed/tgbNymZ7vqY"> </iframe>

</body>
</html>