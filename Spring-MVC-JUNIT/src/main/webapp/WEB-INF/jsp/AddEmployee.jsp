<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save Employee</title>
</head>
<body>

<form action="save" method="post">
<label>Employee ID</label><br>
<input type="text" name="id">
<br>
<br>
<label name="name">Name</label><br>
<input type="text" name="name">
<br>
<br>
<label nam>Salary</label><br>
<input type="text" name="salary">
<br>
<br>
<label>Email</label><br>
<input type="text" name="email">
<br>
<br>

<input type="submit" value="save">
</form>

</body>
</html>