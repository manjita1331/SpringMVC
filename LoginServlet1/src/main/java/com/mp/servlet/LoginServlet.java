package com.mp.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet 
{
private static final long serialVersionUID = 1L;

@Override
public void init() throws ServletException {
	System.out.println("Init Load for LoginServlet");
}

/**
 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
 *      response)
 */
protected void doPost(HttpServletRequest request, HttpServletResponse response)
		throws ServletException, IOException {
	System.out.println("Entered into Servlet");
	Connection connection = null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mp_demo", "root", "Nithya@2011");
		System.out.println("connection Sucessfull");
		Statement statement = connection.createStatement();
		String username = request.getParameter("username");
		System.out.println(username);
		String password = request.getParameter("password");
		System.out.println(password);
		ResultSet resultSet = statement.executeQuery(
				"select * from register where email='" + username + "' and password='" + password + "'");
		
		if (!resultSet.next()) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("loginPage.html");
			requestDispatcher.include(request, response); // In case of failure we have to show user same login page.
		}
		else {
	
		//while (resultSet.next()) {

			if (resultSet.getString(1) != null) {
				System.out.println("Redirecting to SuccessServlet");//Success
				RequestDispatcher requestDispatcher = request.getRequestDispatcher("successServlet");
				requestDispatcher.forward(request, response); // In case of success we have to forward our request to success servlet.
			}
		}
		//}
		

	} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
	}

}
}
