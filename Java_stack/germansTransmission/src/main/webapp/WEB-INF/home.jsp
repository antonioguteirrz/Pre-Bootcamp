<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Registration</title>
</head>
<body>
<div class="container">
		<h1>Register</h1>
		<p><form:errors path="warrrantyObj.*"/></p>
	    <form:form method="POST" action="/newWarranty" modelAttribute="warrantyObj">
	        <p>
	            <form:label path="firstName">First Name:</form:label>
	            <form:input  path="firstName"/>
	            
	        </p>
	        <p>
	            <form:label path="lastName">Password:</form:label>
	            <form:password path="lastName"/>
	          
	        </p>
	        <p>
	            <form:label path="email">Email:</form:label>
	            <form:input type="email" path="email"/>
	            
	        </p>
	        <input type="submit" value="Create Warranty!"/>
	    </form:form>
	</div>
</body>
</html>