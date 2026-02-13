<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="conn.ConnectionPool"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	
	<table border="1">
	<tr>
	<td>Student ID</td>
	<td>Student Name</td>
	<td>Student Email</td>
	<td>Student Phone</td>
	<td>Student STD</td>
	<td>Student Address</td>
	</tr>
	
	<%
	String fetch = "SELECT * FROM student";
	Connection con = ConnectionPool.giveConnection();
	
	Statement stm = con.createStatement();
	ResultSet rs = stm.executeQuery(fetch);
	while(rs.next()){
		

	%>
	<tr>
		<td><%= rs.getInt("sid") %></td>
		<td><%= rs.getString("name")%></td>
		<td><%= rs.getString("email") %></td>
		<td><%= rs.getString("phone") %></td>
		<td><%= rs.getString("std") %></td>
		<td><%= rs.getString("address") %></td>
	</tr>
	
<%
	}
	ConnectionPool.submitConnection(con);
	%>
	

	</table>
	
	<a  href="add.jsp">Add student</a>
	
</body>
</html>