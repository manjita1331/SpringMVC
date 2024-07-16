package com.apex.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apex.entity.User;

public interface UserDao extends JpaRepository<User, Integer>{

	
}
