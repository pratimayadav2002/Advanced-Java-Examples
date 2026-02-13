<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>JSP Tags</h1>
	<hr>
	
	<!-- -Declaration Tag- -->
	
	<%! 
	int a = 10;
	
	public String getMessage(){
		return "hello JSP";
	}
	%>
	
	<!-- - expression tag   -->
	
	<h1>a : <%= a %></h1>
	
	<h1>Greet : <%= "good afternoon" %></h1>
	<h1>Msg : <%= getMessage() %></h1>

	
	<!-- - scriptlet tag   -->
	
	<%
	int b = 10 ;
	out.print("this is of jspwriter");
	%>	


</body>
</html>