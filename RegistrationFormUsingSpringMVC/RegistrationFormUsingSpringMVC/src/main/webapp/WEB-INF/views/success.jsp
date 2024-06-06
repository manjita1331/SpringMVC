<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h3 class="text-center">${Header}</h3>
  <p class="text-center">${Desc }</p>
  <hr>
<h1>Welcome: ${user.name }</h1>
<h1>Your Email ID is: ${user.email}</h1>
<h1>Your Password is: ${user.password } </h1>


</body>
</html>