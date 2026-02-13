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
	String name = request.getParameter("un");
	String email = request.getParameter("ue");
	String phone = request.getParameter("up");
	%>
	
	<h1>User Data</h1>
	<h1>Name : <%= name %></h1>
	<h1>Email : <%= email %></h1>
	<h1>Phone : <%= phone %></h1>
	
	<hr>
	
	<h1>Again,</h1>
	<h2>Name : <%=request.getParameter("un") %></h2>
	<h2>Email : <%=request.getParameter("ue") %></h2>
	<h2>Phone : <%=request.getParameter("up") %></h2>
	
</body>
</html>