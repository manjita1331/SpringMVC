package com.apex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.apex.bean.UserBean;

public class UserDAO {

	public static UserBean getUserBean(UserBean userBean) {

		Connection connection;
		try {
			
			//Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "Nithya@2011");
			System.out.println("Execute Query");
			PreparedStatement statement = connection.prepareStatement("select * from register where username=? and password1=?");
			statement.setString(1, userBean.getUserName());
			statement.setString(2, userBean.getPassword());
			
			ResultSet resultSet = statement.executeQuery();
			
			while (resultSet.next()) {
				
				userBean.setFirstName(resultSet.getString(1));
				userBean.setLastName(resultSet.getString(2));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		return userBean;
	}

}
