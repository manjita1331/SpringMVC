<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1">
        <tr>
            <th>User ID</th>
            <th>Item</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Date of Order</th>
        </tr>


        <%@ page import="java.sql.*" %>
        <%
        
        ResultSet rs = null;
        Connection con = null;
        PreparedStatement ps = null;
        
        String query = "select * from order_table" ;
        
        try { 
        	
        	Class.forName("com.mysql.cj.jdbc.Driver");
        	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mp_demo", "root","Nithya@2011");
        	ps = con.prepareStatement(query);
        	rs = ps.executeQuery();
        	
        	while(rs.next()){ %>
        	
        	<tr> 
        	<td><%=rs.getString(1) %> </td> 
        	<td><%=rs.getString(2) %> </td> 
        	<td><%=rs.getFloat(4) %> </td>
        	<td><%=rs.getInt(3) %> </td>
        	<td><%=rs.getDate(5) %> </td>
        	</tr>
        	
        <% 
        } 
        	%>
      <%   	
        } catch(Exception e)
        {
        	out.print(e);
        }
        
        
        
        %>
        </table>

</body>
</html>