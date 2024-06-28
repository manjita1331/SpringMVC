<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Information</title>
</head>
<body>

<h2> Welcome User:  <%= session.getAttribute("session_fname")%> <%=  session.getAttribute("session_lname") %>!!!</h2>
<form action="contactform" method="post">
	<h3>Contact Information</h3>
	
	<h6 style = 'color:red'> *mandatory fields</h6><br></br>
	Address* :     <input type="text" name = "addr" required placeholder="Address"/><br/><br/>
	City*	:     <input type="text" name = "city" required placeholder="City"/><br/><br/>
	State* :     <input type="text" name = "state" required placeholder="State"/><br/><br/>
	Country* : <select name = "country" required>
				<option value="" selected disabled hidden>Select Country</option>
				<option> India </option>
				<option> USA </option>
				<option> UK </option>
				<option> Canada </option>
				<option> Singapore </option>
				<option> Nepal </option>
			</select><br/><br/>
		Phone# :     <input class="phonenumber" name = "pno"  pattern="[0-9]{10}" maxlength=10 placeholder="Only numbers"/><br/><br/>
		
	
			<input type = "submit" value = "submit"/>
						
	 
	</form>
</body>
</html>