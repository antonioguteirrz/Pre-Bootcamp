<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <title>Document</title>
    
</head>
<body>
    <header>
        <h3>Your Gold:<c:out value="${gold}"/> </h3>
    </header>
    <div class="boxes">
        <div class="indibox">
            <form method="POST" action="gold/process">
                Farm
                <p>(earns 10-20 golds)</p>
                <input  type ="hidden" name ="which_form" value="farm">
                <input type = "submit">
            </form>
        </div>
        <div class="indibox">
            <form method="POST" action="gold/process">
                Cave
                <p>(earns 5-10 golds)</p>
                <input  type ="hidden" name ="which_form" value="cave">
                <input type = "submit">
            </form>
        </div>
        <div class="indibox">
            <form method="POST" action="gold/process">
                House
                <p>(earns 2-5 golds)</p>
                <input  type ="hidden" name ="which_form" value="house">
                <input type = "submit">
            </form>
        </div>
        <div class="indibox">
            <form method="POST" action="gold/process">
                Casino
                <p>(earns/taken 0-50 golds)</p>
                <input  type ="hidden" name ="which_form" value="casino">
                <input type = "submit">
            </form>
        </div>
    </div>
    <div class="activitiesbox">
        Activities: 
        <c:forEach items="${added_list}" var="item">
    	${item}<br>
		</c:forEach>
    </div>
    <form method="POST" action="gold/process">
    <input  type ="hidden" name ="which_form" value="reset">
    <input type = "submit" value="Reset">
    </form>
</body>
</html>