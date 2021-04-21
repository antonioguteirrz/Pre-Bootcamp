<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
    <%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>   
<h1>Edit Book</h1>

<div>
	<form:form action = "/language/${languageObj.id}/edit" method="POST" modelAttribute="languageObj">
   		
    	<p>
        	<form:label path="name">Name</form:label>
        	<form:errors path="name"/>
        	<form:input path="name"/>
    	</p>
     
    	<p>
        	<form:label path="creator">Creator</form:label>
        	<form:errors path="creator"/>
        	<form:input path="creator"/>
    	</p>
    	<p>
        	<form:label path="version">Version</form:label>
        	<form:errors path="version"/>
        	<form:input path="version"/>
    	</p>    
    	<input type="submit" value="Submit"/>
    
</form:form>
</div>
</body>