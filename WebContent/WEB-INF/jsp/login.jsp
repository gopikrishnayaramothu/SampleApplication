<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form method="POST" action="home.obj" commandName="loginDetails">
<table align="center">
<tr>
<td>Please Login</td>
<td><form:input path="userName"/></td>
</tr>
<tr>
<td>Enter Password</td>
<td><form:password path="passWord"/></td>
</tr>
<tr>
<td><input type="submit" value="submit"></td>
<td></td>
</table>
</form:form>
</body>
</html>