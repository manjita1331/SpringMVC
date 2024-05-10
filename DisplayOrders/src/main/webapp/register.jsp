<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="regform" method="post">
	<h3>Registration Form</h3>
	
	<h6 style = 'color:red'> *mandatory fields</h6><br></br>
	Name* :     <input type="text" name = "name1" required/><br/><br/>
	
	Email* :    <input type="text" name = "email1" required/><br/><br/>
	
	PassWord* : <input type="password" name = "pass1" required/><br/><br/>
	Gender* :   <input type="radio" required name = "gender1" value = "Male"/> Male <input type ="radio" name="gender1" value = "female"/> Female<br/><br/>
	
	City* : <select name = "city1" required>
				<option value="" selected disabled hidden>Select City</option>
				<option> SanRamon </option>
				<option> Dublin </option>
				<option> Livermore </option>
				<option> Patterson </option>
				<option> Modesto </option>
				<option> Turlock </option>
			</select><br/><br/>
			<input type = "submit" value = "Register"/>
			<a href = login.jsp> Login Here </a>
			
	
	</form>
</body>
</html>