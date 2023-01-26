<%@page import="java.util.List"%>
<%@page import="com.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
</head>
<body>
<h1></h1>


<%List<Employee> employee =(List<Employee>) request.getAttribute("employees");;

	%>
	
	
	
	<%String msg=(String)request.getAttribute("msg");%>

	<% %>
	
	<table border="3px">
	<tr><th>Employee ID</th> <th>Name</th><th>Salary</th><th>Email ID</th><th>Update</th>
	<th>Delete</th>
	<%for(Employee emp:employee){%>
	<tr><td><%= emp.getId() %></td>
	<td><%= emp.getName() %></td>
	<td><%= emp.getSalary() %></td>
	<td><%= emp.getEmail() %></td>
	<td><a href="./updateEmp?id=<%=emp.getId()%>">Update</a></td>
	<td><a href="./delete?iid=<%=emp.getId()%>">Delete</a></td>
	</tr><% } %>

	</table>
	
<a href="./home">Home</a>
</body>
</html>