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
<table border="1">
<tr>
			<th>id</th>
			<th>name</th>
			<th>location</th>
			<th>domain</th>
			<th>Operarions</th>
		</tr>
  <c:forEach items="${results}" var="item">
    <tr style="color:green">
      <td><c:out value="${item.traineeId}" /></td>
      <td><c:out value="${item.traineeName}" /></td>
      <td><c:out value="${item.traineeLocation}" /></td>
      <td><c:out value="${item.traineeDomain}" /></td>
      <td></td>
    </tr>
  </c:forEach>
</table>
<a href="homeA">HOME</a>
</body>
</html>