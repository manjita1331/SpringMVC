package com.apex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import java.sql.SQLException;


import com.apex.bean.PersonalBean;

public class PersonalDAO {


	public static PersonalBean getPersonalBean(PersonalBean personalBean) {

		System.out.println("in DAO personalbean");
		Connection connection;
		
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "Nithya@2011");
			System.out.println("Execute Query");
			
			PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO personalinfo (FirstName, MiddleName, LastName, Gender) VALUES (?, ?, ?, ?)");
			preparedStatement.setString(1, personalBean.getFirstName());
			preparedStatement.setString(2, personalBean.getMiddlename());
			preparedStatement.setString(3, personalBean.getLastname());
			preparedStatement.setString(4, personalBean.getGender());
			
			preparedStatement.executeUpdate();
			
			connection.close();
			
		} 
	   catch (SQLException e) {
			e.printStackTrace();
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}

		return personalBean;

}
}
