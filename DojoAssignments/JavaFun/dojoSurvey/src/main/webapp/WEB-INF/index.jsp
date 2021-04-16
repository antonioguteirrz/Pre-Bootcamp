<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Please sign up</h1>
<form method="POST" action="/display">
    <p>
    	<label>Your Name: 
    		<input type="text" name="name">
    	</label>
    </p>
    <p>
		<label> Dojo Location:
			<select name="location">
    			<option value="San Jose">San Jose</option>
    			<option value="Burbank">Burbank</option>
    			<option value="New York">New York</option>
			</select>
		</label>
	</p>
	<p>
		<label>Favorite Language:
			<select name="language">
    			<option value="Python">Python</option>
    			<option value="Java">Java</option>
    			<option value="Mern">Mern</option>
			</select>
		</label>
    </p>
    <p>
    <label>Comment: <input type="text" name="comment"></label>
    </p>
 	<button>Button</button>
</form>
</body>
</html>