<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@include file="header.jsp"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<h1><c:out value="${personFound.firstName}" /></h1>
<c:out value="${personFound.lastName}" />
<c:out value="${personFound.email}" />
<div class="container">
<a href="http://localhost:8080/checkwarranty">Check other warranty</a>
	</div>
</body>
</html>