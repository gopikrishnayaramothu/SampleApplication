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
<form action="testCases1.obj" method="post">
<table>
<tr>
<td>Select Application</td>
<td><select name="application">
<option value="-1">Select---</option>
<option value="Orbit">Orbit</option>
<option value="Amfeed">Amfeed</option>
</select>
</td>
<td>
<input type="submit" value="Get TetCases"></td>
</tr>
</table>
</form>
<c:if test="${result == '1'}">
<jsp:include page="display.jsp"></jsp:include>
</c:if>

</body>
</html>