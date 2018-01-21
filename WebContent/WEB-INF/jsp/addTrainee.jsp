<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	${message}
	<form:form action="doAddTrainee.obj" commandName="traineeDetails">
		<h2>Enter Trainee Details</h2>
		<table border="1">
			<tr>
				<td>Trainee ID</td>
				<td><form:input path="traineeId"/>
			 </td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><form:input path="traineeName" /></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><form:input path="traineeLocation" /></td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td><form:input path="traineeDomain" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="add"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>