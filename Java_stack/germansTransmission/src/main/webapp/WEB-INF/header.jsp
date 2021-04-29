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
<body>
<div align="center">
<h1>
Germans Transmissions
</h1> 
<div>
<div class="btn-group btn-group-toggle" data-toggle="buttons">
  <label class="btn btn-secondary active">
    <input type="radio" name="options" id="option1" autocomplete="off" checked> 
    <a href = "http://localhost:8080">About Us</a>
  </label>
  <label class="btn btn-secondary">
    <input type="radio" name="Warranty" id="option2" autocomplete="off"> 
    <a href = "http://localhost:8080/checkwarranty">Warranty Check</a>
  </label>
  <label class="btn btn-secondary">
    <input type="radio" name="options" id="option3" autocomplete="off">
    <a href = "http://localhost:8080/contactUs">Contact Us</a>
  </label>
</div>
</div>
</div>
</body>
</html>