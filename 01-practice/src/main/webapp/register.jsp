<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Welcome to Register</h1>
<form action="register" method="post">
	<input type="text" name="name" placeholder="Enter Name" required> <br>
	<input type="email" name="email" placeholder="Enter Email" required> <br>
	<input type="password" name="password" placeholder="Enter Password" required> <br>

	<input value="submit" type="submit">
</form>
</body>
</html>