<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>Edit Show</h1>
		<form:form action="/checkWarranty" method="POST" modelAttribute="warrantyObj">
		
			<p>
				Warranty
				<form:input path="warrantyNumber" type="text" />
				<form:errors path="warrantyNumber" />
			</p>
			<button type="submit" class="btn btn-primary">Update</button>
		</form:form>
	</div>
</body>
</html>