<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	welcome
	<table border="1">
		<tr>
			<th>id</th>
			<th>name</th>
			<th>location</th>
			<th>domain</th>
		</tr>
		<tr style="color: orange">
			<td>${result.traineeId}</td>
			<td>${result.traineeName}</td>
			<td>${result.traineeLocation}</td>
			<td>${result.traineeDomain}</td>
		</tr>
	</table>
	<a href="homeA">HOME</a>
</body>
</html>