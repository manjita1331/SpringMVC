package com.apex.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.dao.UserDao;
import com.apex.entity.User;
@Service
public class UserServiceImpl implements UserService {
@Autowired
	 UserDao userDao;
	@Override
	public String upsert(User user) {
		userDao.save(user);
		return "success";
	}
	

	@Override
	public User getById(Integer userid) {
		 if (userid == null) {
	            throw new IllegalArgumentException("The given id must not be null");
	        }

	        Optional<User> user = userDao.findById(userid);
	        return user.orElse(null);
	
	}

	@Override
	public List<User> getAllUsers() {
			return userDao.findAll();

	
	}

	@Override
	public String deleteById(Integer userid) {
		if(userDao.existsById(userid)) {
			userDao.deleteById(userid);
			return "Delete success";
		}else {
		return "No record found!!!";
		}
	}

}
