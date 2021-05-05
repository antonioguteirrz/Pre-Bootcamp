<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@include file="header.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Find Warranty</title>
<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="/css/main.css" />
</head>
<body>
	<div align="center">
		<h1>Input email to send warrantyh1>
		<form:form action="/sendEmail" method="POST" modelAttribute="warrantyObj">
		
			<p>
				Email
				<form:input path="email" type="text" />
				<form:errors path="email" />
			</p>
			<button type="submit" class="btn btn-primary">Send to email</button>
		</form:form>
	</div>
</body>
</html>