package com.user.service;

import java.util.List;
import java.util.Optional;

import com.user.entity.User;


public interface UserService {

	public User saveUser(User user);
	
	public List<User> getUserList();
	
	//public Optional<User> getUser(long userId);
	public User getUser(long userId);
	
	
	
	
}
