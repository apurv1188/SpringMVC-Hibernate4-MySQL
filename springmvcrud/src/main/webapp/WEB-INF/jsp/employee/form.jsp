<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib prefix = "form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib prefix = "spring" uri="http://www.springframework.org/tags" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Form</title>
</head>
<body>
<spring:url value="employee/save/" var ="saveURL"/>
<form:form action="${saveURL}" method = "POST" modelAttribute="employeeForm">
<form:hidden path ="emp_id"/>
<table width ="100%" border ="1">
<tr>
<td>Employee Name</td>
<td><form:input path ="emp_name"/></td>
</tr>
<tr>
<td>Employee Email</td>
<td><form:input path ="emp_email"/></td>
</tr>
<tr>
<td>Employee Number</td>
<td><form:input path ="emp_numb"/></td>
</tr>
<tr>
<td></td>
<td><button type="submit">Save</button> </td>
</tr>


</table>
</form:form>
</body>
</html>