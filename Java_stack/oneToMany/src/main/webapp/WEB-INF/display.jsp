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
 ${dojo_name}
<c:forEach items="${allNinjas}" var="dojoe">
				 
				 <c:choose>
								<c:when test="${dojoe.dojo.id == dojo_id }">
							<p>First Name:${dojoe.firstName}  Last Name:${dojoe.lastName}
										</p>
								</c:when>
					</c:choose>
</c:forEach>
</body>
</html>