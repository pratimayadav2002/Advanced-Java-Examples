<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>custom tags</h1>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	
	<!-- JSTL -->
	
    <!-- creating variable  -->	<!-- ctrl+shift+/ -->
	<hr>
	<c:set var="a" value="100"></c:set>
	
	<!-- print a variable  -->
	<h2>
	<c:out value="${a}"></c:out>
	</h2>
	
	<c:choose>
	<c:when test="${a==100}">
	<h1>yes a contains 100</h1>
	</c:when>
	<c:when test="${a>100 }">
	<h1>a is greater than 100</h1>
	</c:when>
	<c:otherwise>
	<h1>a is less than 100</h1>
	</c:otherwise>
	</c:choose>
	
	<hr>
	
	<c:remove var="a"/>
	
	<h2>
	<c:out value="${a}"></c:out>
	</h2>
	
   <%-- <c:redirect url="https://www.instagram.com/"></c:redirect> --%>
	
	<c:import url="https://www.instagram.com/"></c:import>
	
</body>
</html>