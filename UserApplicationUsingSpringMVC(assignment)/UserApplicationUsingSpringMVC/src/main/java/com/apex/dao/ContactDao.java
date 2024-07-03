package com.apex.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apex.beans.ContactBeans;

@Repository
public class ContactDao {

	@Autowired
	JdbcTemplate jdbcTemplate1;
	
	public int savecontact(ContactBeans contactBean) {
		System.out.println(contactBean.getAddress());
		String sql = "INSERT INTO contactinfo (Address, City,State,Country,Phoneno) VALUES ( ?, ?,?,?,?)";
		int i = jdbcTemplate1.update(sql,contactBean.getAddress(),contactBean.getCity(),contactBean.getState(),contactBean.getCountry(),contactBean.getPhoneno());
		return i;
	
	}
}
