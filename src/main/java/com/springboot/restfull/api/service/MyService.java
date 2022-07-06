package com.springboot.restfull.api.service;

import com.springboot.restfull.api.model.User;

public interface MyService {
	
	public User greetUser(User u);
	public User greetUserFromUrl(String name,User u);

}
