<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="successform" method="post">
<h1>Registered Successfully!<%= session.getAttribute("session_fname")%> <%=  session.getAttribute("session_lname") %>!!</h1>
<sql:setDataSource
        var="myDS"
        driver="com.mysql.cj.jdbc.Driver"
        url="jdbc:mysql://localhost:3306/sp_demo"
        user="root" password="Nithya@2011"
    />


 
    
<sql:query  var="personalinfo" dataSource="${myDS}">
        SELECT * FROM personalinfo ORDER BY id DESC LIMIT 1;
    </sql:query>
    
<h3> Personal Information :</h3>
        <table border="1" cellpadding="5">

            <tr>
                <th>First Name</th>
                <th>Middle Name</th>
                <th>Last Name</th>
                <th>Gender</th>
            </tr>
           <c:forEach var="user" items="${personalinfo.rows}">
                <tr>
                    <td><c:out value="${user.firstname}" /></td>
                    <td><c:out value="${user.MiddleName}" /></td>
                    <td><c:out value="${user.LastName}" /></td>
                    <td><c:out value="${user.Gender}" /></td>
                </tr>
                </c:forEach>
                
        
        </table>
<h3> Contact Information :</h3>
  <sql:query  var="contactinfo" dataSource="${myDS}">
        SELECT * FROM contactinfo ORDER BY id DESC LIMIT 1;
    </sql:query>
    

        <table border="1" cellpadding="5">

            <tr>
                <th>Address</th>
                <th>City</th>
                <th>State</th>
                <th>Country</th>
                <th>Phone No</th>
            </tr>
           <c:forEach var="contact" items="${contactinfo.rows}">
                <tr>
                    <td><c:out value="${contact.address}" /></td>
                    <td><c:out value="${contact.city}" /></td>
                    <td><c:out value="${contact.state}" /></td>
                    <td><c:out value="${contact.country}" /></td>
                     <td><c:out value="${contact.phoneno}" /></td>
                </tr>
                </c:forEach>
                
        
        </table>  
        <h3> Bank Details:</h3>
        <sql:query  var="bankinfo" dataSource="${myDS}">
        SELECT * FROM bankinfo ORDER BY id DESC LIMIT 1;
    </sql:query>
    

        <table border="1" cellpadding="5">

            <tr>
                <th>Bank Name</th>
                <th>Account #</th>
                <th>SSN</th>
             
            </tr>
           <c:forEach var="bank" items="${bankinfo.rows}">
                <tr>
                    <td><c:out value="${bank.bankname}" /></td>
                 
                    <td><c:out value="${bank.accno}" /></td>
                    <td><c:out value="${bank.ssn}" /></td>
                </tr>
                </c:forEach>
                
        
        </table>
        


</form>

</body>
</html>