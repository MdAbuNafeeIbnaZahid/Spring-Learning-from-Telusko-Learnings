<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Add Alien<br>
	<form action="addAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="text" name="tech"><br>
		<input type="submit"> <br>
	</form>
	
	<br>
	
	Get Alien by aid<br>
	<form action="getAlien">
		<input type="text" name="aid"><br>
		<input type="submit"> <br>
	</form>
	
	Update Alien <br>
	<form action="updateAlien">
		<input type="text" name="aid"><br>
		<input type="text" name="aname"><br>
		<input type="text" name="tech"><br>
		<input type="submit"> <br>
	</form>
	
	
	Delete Alien <br>
	<form action="deleteAlien">
		<input type="text" name="aid"><br>
		<input type="submit"> <br>
	</form>
	
	
	
	
</body>
</html>