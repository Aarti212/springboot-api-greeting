package com.springboot.restfull.api.service;

import org.springframework.stereotype.Service;

import com.springboot.restfull.api.model.User;

@Service
public class MyServiceImpl implements MyService {

	@Override
	public User greetUser(User u) {
		u.Msg="Good Morning "+u.UserName;
		return u;
	}

	@Override
	public User greetUserFromUrl(String name, User u) {
		u.UserName=name;
		u.Msg="Good Morning ";
		return u;
	}

}
