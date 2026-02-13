<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<form action="addstudent" method="post">
	
	<input type="number" name="sid" placeholder="Enter Sid" required>
	 <br>
	<input type="text" name="name" placeholder="Enter Name" required> 
	<br>
	<input type="email" name="email" placeholder="Enter Email" required> 
	<br>
	<input type="number" name="phone" placeholder="Enter no" required> 
	<br>
	<input type="text" name="std" placeholder="Enter STD" required> 
	<br>
	<input type="text" name="add" placeholder="Enter Add" required> 
	<br>
	
	<input type="submit" value="Submit">
	<br>
	</form>
	
	 <a href="list.jsp">Student list</a>
	 
</body>
</html>