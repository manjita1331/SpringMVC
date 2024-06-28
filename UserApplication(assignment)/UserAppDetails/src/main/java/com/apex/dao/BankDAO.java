package com.apex.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.apex.bean.BankBean;

public class BankDAO {
	
	public static BankBean getBankBean(BankBean bankBean)
	{
		Connection connection;
		
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sp_demo", "root", "Nithya@2011");
		
		PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO bankinfo (bankname, accno,ssn) VALUES ( ?, ?,?)");
		
		preparedStatement.setString(1, bankBean.getBankname());
		preparedStatement.setString(2, bankBean.getAccountno());
		preparedStatement.setString(3, bankBean.getSsn());

		preparedStatement.executeUpdate();
		} catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return bankBean;
	}

}
