package com.crud.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.stereotype.Service;

import com.crud.models.User;

@Service
public class UserService {
	
	private Map<Integer, User> userMap = new HashMap<>();
	private AtomicInteger atomicId = new AtomicInteger();
	
	public String addUser(User user)
	{
		user.setId(atomicId.incrementAndGet());
		userMap.put(user.getId(), user);
		return "user added sucessfully";
	}
	
	public Collection<User> getAllUsers()
	{
		return userMap.values();
	
	}

} 
