<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help page</title>
</head>
<body>

<% 
String name=(String) request.getAttribute("name");
Integer contactno=(Integer) request.getAttribute("contactno");
%>
<h1>Hi....This is help page</h1>
<h1>Hello my name is:<%=name %></h1>
<h1>My Contact number is : <%=contactno %></h1>
</body>
</html>