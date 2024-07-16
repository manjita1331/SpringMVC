package com.apex.service;

import java.util.List;

import com.apex.entity.User;

public interface UserService {
	public String upsert(User user);
	public User getById(Integer userid);
	public List<User> getAllUsers();
	public String deleteById(Integer userid);
		
	}


