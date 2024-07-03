package com.apex.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.apex.beans.PersonalBeans;

@Repository
public class PersonalDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public int savepersonal(PersonalBeans personalBean) {

		String sql = "insert into personalinfo (FirstName,MiddleName,LastName,Gender) values (?,?,?,?)";
		int i = jdbcTemplate.update(sql, personalBean.getFirstName(), personalBean.getMiddlename(),
				personalBean.getLastname(), personalBean.getGender());

		return i;

	}

}
