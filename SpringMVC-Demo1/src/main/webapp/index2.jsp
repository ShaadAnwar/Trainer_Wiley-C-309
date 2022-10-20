<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Form</title>
</head>
<body>
	<form:form action="save" method="post" modelAttribute="user">
		User Name: <form:input type="text" path="name" />
		<br>
		<br>
		Email: <form:input type="email" path="email" style="margin-left:34px;" />
		<br>
		<br> 
		Password: <form:input type="password" path="password"  style="margin-left:10px;" />
		<br>
		<br>
		Confirm Password: <form:input type="password" path="confirm_password" />
		<br>
		<br>
		<input type="submit" value="Register">
	</form:form>
</body>
</html>