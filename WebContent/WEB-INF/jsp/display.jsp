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
<h1 style="color:orange">${application } TEST CASES</h1>
<table border="1">
<tr>
			<th>TestCase name</th>
			<th>Action</th>
		</tr>
  <c:forEach items="${ls}" var="item">
  
    <tr style="color:green">
      <td><c:out value="${item}" /></td>
      <td>
      <form action="execute.obj">
      <input type="hidden" name="testname" value="${item}">
      <input type="hidden" name="application" value="${application}">
      <input type="submit" value="run">
      </form>
      </td>      
    </tr>
  </c:forEach>
</table>
<c:if test="${result23 == '1'}">
<h1 style="color:orange">${Result}</h1>
</c:if>
</body>
</html>