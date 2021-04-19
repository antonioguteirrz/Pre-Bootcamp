<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please input code</h1>
<p><c:out value="${error}"></c:out></p>
<form method="POST" action="/process">
    <label>Code: <input type="text" name="code"></label>
    <button>Login</button>
</form>
</body>
</html>