package com.apex.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apex.beans.BankBeans;


@Repository
public class BankDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	public int savebankinfo(BankBeans bankBean) {
		String sql = "INSERT INTO bankinfo (bankname, accno,ssn) VALUES ( ?, ?,?)";
		int i = jdbcTemplate.update(sql,bankBean.getBankname(),bankBean.getAccountno(),bankBean.getSsn());
		return i;
	}

}
