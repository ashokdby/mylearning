package com.user.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	

	@PostMapping("/adduser")
	public ResponseEntity<User> saveUser(@RequestBody User user) {
		User user1 =  userService.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	
	@GetMapping("/{userId}") 
	public ResponseEntity<User> getSingleUser(@PathVariable long userId) {
		User user1 = userService.getUser(userId);
		return ResponseEntity.status(HttpStatus.OK).body(user1);
	}
	
	
	@GetMapping("/getUser")
	public ResponseEntity<List<User>> getUserList() {
		
		List<User> userlist = userService.getUserList();
		return ResponseEntity.status(HttpStatus.OK).body(userlist);
	}
	
}
