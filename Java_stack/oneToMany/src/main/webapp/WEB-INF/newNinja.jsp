<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<form:form action="/newNinja" method="POST" modelAttribute="ninjaObj">
			<p>
				Dojo:
		        <form:select path="dojo">
		        <c:forEach items="${allDojos}" var="dojoe">
					<form:option value="${dojoe.id}">
						<c:out value="${dojoe.name}"/>
					</form:option>
					</c:forEach>
		        </form:select>
			</p>
			<p>
		        <form:label path="firstName">First Name</form:label>
		        <form:input path="firstName"/>
		        <p><form:errors path="firstName"/>
			</p>
						<p>
		        <form:label path="lastName">Last Name</form:label>
		        <form:input path="lastName"/>
		        <p><form:errors path="lastName"/>
			</p>
						<p>
		        <form:label path="age">Age</form:label>
		        <form:input path="age"/>
		        <p><form:errors path="age"/>
			</p>
			<button type="submit">Create Ninja</button>
		</form:form>
</body>
</html>