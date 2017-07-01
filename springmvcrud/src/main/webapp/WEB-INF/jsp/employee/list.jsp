<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"  %>
    <%@ taglib prefix = "spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee</title>
</head>
<body>
<spring:url value="employee/add/${employee.id}" var ="addURL"/>
<a href = "${addURL}"> Add new Employee</a>
<table width ="100%" border ="1">
<tr>

<td>emp_name</td>
<td>emp_email</td>
<td>emp_numb</td>
<td colspan="2" > Action </td>
</tr>
<c:forEach items= "${list}" var = "employee">
<tr>
<td>${employee.emp_id}</td>
<td>${employee.emp_name}</td>
<td>${employee.emp_email}</td>
<td>${employee.emp_numb}</td>
<td>
<spring:url value="employee/update/${employee.id}" var ="updateURL"/>
<a href = "${updateURL}"> Update</a>
</td>
<td>
<spring:url value="employee/delete/${employee.id}" var ="deleteURL"/>
<a href = "${deleteURL}"> Delete</a>
</td>

</tr>
</c:forEach>
</table>

</body>
</html>