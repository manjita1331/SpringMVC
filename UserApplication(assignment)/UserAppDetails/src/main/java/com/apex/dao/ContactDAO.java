package com.apex.dao;

import java.net.http.HttpRequest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.apex.bean.ContactBean;

import jakarta.servlet.http.HttpSession;

public class ContactDAO 
{
	

	public static ContactBean getContactBean(ContactBean contactBean)
	{
	Connection connection;

	
	
System.out.println("In Contact DAO");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "Nithya@2011");
		
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO contactinfo (Address, City,State,Country,Phoneno) VALUES ( ?, ?,?,?,?)");
		
		preparedStatement.setString(1, contactBean.getAddress());
		preparedStatement.setString(2, contactBean.getCity());
		preparedStatement.setString(3, contactBean.getState());
		preparedStatement.setString(4, contactBean.getCountry());
		preparedStatement.setString(5, contactBean.getPhoneno());
		preparedStatement.executeUpdate();
		} catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return contactBean;
}
}
