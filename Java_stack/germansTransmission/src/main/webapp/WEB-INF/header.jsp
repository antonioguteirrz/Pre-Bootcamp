<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="/webjars/bootstrap/4.5.0/css/bootstrap.min.css" />
<script src="/webjars/jquery/3.5.1/jquery.min.js"></script>
    <script src="/webjars/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body style = "background-color:yellow">
<div align="center">
<h1 style = height:100%>
Germans Transmissions
</h1> 
<div>
<div class="btn-group btn-group-toggle" data-toggle="buttons" style= width:100%  >
  <label class="btn btn-secondary" onclick ="active" onclick ="window.location.href = 'http://localhost:8080';" >
    <input type="radio" name="options" autocomplete="off"> 
	About Us
  </label>
  <label class="btn btn-secondary"  value = "About Us" onClick ="window.location.href = 'http://localhost:8080/checkwarranty';active">
    <input type="radio" name="Warranty" autocomplete="off"> 
    Warranty
  </label>
  <label class="btn btn-secondary" onClick ="window.location.href = 'http://localhost:8080/contactUs';active">
    <input type="radio" name="options" autocomplete="off">
    Contact Us
  </label>
</div>
</div>
</div>
</body>
</html>