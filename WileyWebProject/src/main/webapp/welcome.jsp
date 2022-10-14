<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.sql.*,com.wiley.Utility"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	 
	
	<%
		String user=request.getParameter("username");
		String password=request.getParameter("password");
		
		if(user.equals("mandar"))
	%>
	Welcome, <b>
	<%=user %></b>
	
	
	
	
</body>
</html>