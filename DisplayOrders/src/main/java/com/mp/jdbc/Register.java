package com.mp.jdbc;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
@WebServlet("/regform")
/**
 * Servlet implementation class Register
 */
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter out = resp.getWriter();
		String myname = req.getParameter("name1");
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		String mygender = req.getParameter("gender1");
		String mycity = req.getParameter("city1");
		try 
		{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mp_demo", "root", "Nithya@2011");
			Statement s = con.createStatement();
			ResultSet rs = s.executeQuery("Select * from register where email = '" + myemail +"'");
			if (rs.next())
			{
				//out.print("The user already exists");	
				resp.setContentType("text/html");
				RequestDispatcher rd = req.getRequestDispatcher("/fail.jsp");
				rd.include(req, resp);
			}
			else
			{
			PreparedStatement ps = con.prepareStatement("insert into register values (?,?,?,?,?)");
			ps.setString(1, myname);
			ps.setString(2, myemail);
			ps.setString(3, mypass);
			ps.setString(4, mygender);
			ps.setString(5, mycity);
			int count = ps.executeUpdate();
			if(count>0)
			{
				resp.setContentType("text/html");
				RequestDispatcher rd = req.getRequestDispatcher("/success.jsp");
				//out.print("<h3 style = 'color:green'> User registered successfully </h3>");
				//RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
				
			}
			else
			{
				resp.setContentType("text/html");
				out.print("<h3 style = 'color:red'> User not registered due to some error </h3>");
				RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
				rd.include(req, resp);
				
				
			}
		}
		}
		
		
		catch(Exception e)
		{
			e.printStackTrace();
			resp.setContentType("text/html");
			out.print("<h3 style = 'color:red'> Exception Occured : "+e.getMessage()+" </h3>");
			RequestDispatcher rd = req.getRequestDispatcher("/register.jsp");
			rd.include(req, resp);
		}
	
	
	}

}
