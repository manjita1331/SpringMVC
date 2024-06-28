<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>personal info</title>
</head>
<body>
<form action="personalform" method="post">
	<h3>Personal Information</h3>
	
	<h6 style = 'color:red'> *mandatory fields</h6><br></br>
	First Name* :     <input type="text" name = "fname" required placeholder="First Name"/><br/><br/>
	Middle Name :     <input type="text" name = "mname" placeholder="Middle Name"/><br/><br/>
	Last Name* :     <input type="text" name = "lname" required placeholder="Last Name"/><br/><br/>
		
	Gender* :   <input type="radio" required name = "gender" value = "Male"/> Male <input type ="radio" name="gender" value = "female"/> Female<br/><br/>
	
			<input type = "submit" value = "submit"/>
		 	
	 
	</form>

</body>
</html>