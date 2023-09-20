package com.crud.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.models.User;
import com.crud.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	UserService userService;
	
	

	@GetMapping("")
	public Collection<User> getAllUsers()
	{
		Collection<User> all_users=userService.getAllUsers();
		return all_users;	
	}
	
	@PostMapping("")
	public String addUser(@RequestBody User user)
	{
		String response=userService.addUser(user);
		return response;
		
	}
}
