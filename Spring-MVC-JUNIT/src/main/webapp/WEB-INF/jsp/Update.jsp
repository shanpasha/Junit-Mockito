<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update EmployeeS</title>
</head>
<body>
<%Employee emp=(Employee)request.getAttribute("Employee"); %>

<form action="./update" method="post">
<label>Employee ID</label><br>
<input type="text" name="id" value="<%=emp.getId() %>"  readonly="readonly">
<br>
<br>
<label >Name</label><br>
<input type="text" name="name" value="<%=emp.getName() %>">
<br>
<br>
<label >Salary</label><br>
<input type="text" name="salary" value="<%=emp.getSalary() %>">
<br>
<br>
<label>Email</label><br>
<input type="text" name="email" value="<%=emp.getEmail() %>">
<br>
<br>

<input type="submit" value="update">
</form>
</body>
</html>