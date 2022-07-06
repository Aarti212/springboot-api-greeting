package com.springboot.restfull.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restfull.api.model.User;
import com.springboot.restfull.api.service.MyService;

@RestController
public class GreetingController {
	
	@Autowired
	public MyService myservice;
	
	@PostMapping("greet")
	public User greetingUser(@RequestBody User u) {
		return myservice.greetUser(u);
	}
	
	@GetMapping("greet/{name}")
	public User greeyUrl(@PathVariable ("name") String name, User u ) {
		return myservice.greetUserFromUrl(name, u);
	}

}
