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
<form:form action="doDeleteTrainee.obj" commandName="traineeDeleteDetails">
<h2>Delete Operation</h2>
<table align="left" border="1">
<tr>
<td>Please Enter Trainee ID</td>
<td><form:input path="traineeId"/></td>
<td><input type="submit" value="delete"></td>
</tr>
</table>
</form:form>
</body>
</html>