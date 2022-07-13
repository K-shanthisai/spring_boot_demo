<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Details Here</title>
</head>
<body>
	
	<form action="addEmployee">
		<label for="fname">Employee ID:</label>
		<input type="text" name="eid"><br><br>
		<label for="lname">Employee Name:</label>
		<input type="text" name="ename"><br><br>
		<label for="lname">Technology:</label>
		<input type="text" name="tech"><br><br>
		<input type="submit"><br><br>
	</form>	
	
	<form action="getEmployee">
		<label for="fname">Employee ID:</label>
		<input type="text" name="eid"><br><br> 
		<input type="submit"><br><br>
	</form>	
</body>
</html>