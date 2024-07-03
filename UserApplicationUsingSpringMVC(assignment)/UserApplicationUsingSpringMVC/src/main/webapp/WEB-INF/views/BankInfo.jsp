<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Bank Details</title>
</head>
<body>
<h2> Welcome !!!</h2>

<form action="bankform" method="post">
	<h3>Bank Details</h3>

Bank Name* : <select name = "bankname" required>
				<option value="" selected disabled hidden>Select Bank</option>
				<option> BOA </option>
				<option> US Bank </option>
				<option> SBI </option>
				<option> Chase </option>
				<option> ICICI</option>
				<option> HDFC </option>
			</select><br/><br/>
		Account# :     <input type="text" name = "accountno" placeholder="Account Number"/><br/><br/>
		SSN :     <input type="text" name = "ssn"  pattern="[0-9]{9}" maxlength=9 placeholder="Only numbers"/><br/><br/>
		
		<input type = "submit" value = "submit"/>
		 	
</form>

</body>
</html>