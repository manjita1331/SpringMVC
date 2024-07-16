package com.apex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apex.entity.User;
import com.apex.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	// private Object userService;

	@PostMapping(path = "/users", consumes = "application/json")
	public String upsert(@RequestBody User user) {
		return this.userService.upsert(user);
	}

	@GetMapping("/users")
	public List<User> getAllUsers() {
		return this.userService.getAllUsers();
	}

	@GetMapping("/users/{userid}")
	public ResponseEntity<User> getById(@PathVariable("userid") Integer userid) {
		if (userid == null) {
			// return this.userService.getById(Integer(userid));
			return ResponseEntity.badRequest().build();
		}
		User user = userService.getById(userid);
		if (user == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);
	}

	private Integer Integer(Integer userid) {

		return null;
	}

	@DeleteMapping("/users/{userid}")
	public ResponseEntity<HttpStatus> deleteById(@PathVariable String userid) {
		try {
			this.userService.deleteById(Integer.parseInt(userid));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
