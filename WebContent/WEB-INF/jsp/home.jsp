<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3 style="color:blue">${message}</h3>
	<table border=1 align="center">
		<tr>
			<th>Pick your Operation</th>
		</tr>
		<tr>
			<td><a href="goAddTrainee.obj" target="_parent">Add a
					Trainee</a></td>
		</tr>
		<tr>
			<td><a href="goDeleteTrainee.obj" target="_parent">Delete a
					Trainee</a></td>
		</tr>
		<tr>
			<td><a href="goModifyTrainee.obj" target="">Modify a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="getTrainee" target="">Retrieve a Trainee</a></td>
		</tr>
		<tr>
			<td><a href="getAllTrainees" target="">Retrieve all Trainees</a></td>
		</tr>

	</table>
</body>
</html>