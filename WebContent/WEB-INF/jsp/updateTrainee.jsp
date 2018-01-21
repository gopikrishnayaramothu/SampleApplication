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
	<form:form action="doUpdateTrainee.obj" commandName="finalTrainee">
		<h2 style="color: green">Trainee Info</h2>
		<table border="1">
			<tr>
				<td>Trainee ID</td>
				<td><input type="text" disabled="disabled"
					value="${updatedTrainee.traineeId}"> <input type="hidden"
					name="id" value="${updatedTrainee.traineeId}" /></td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><input type="text" name="nameChange"
					value="${updatedTrainee.traineeName}"></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><input type="text" name="locationChange"
					value="${updatedTrainee.traineeLocation}"></td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td><input type="text" name="domainChange"
					value="${updatedTrainee.traineeDomain}"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="update"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>