package com.capgemini.cab.service;

import org.springframework.stereotype.Service;

import com.capgemini.cab.entity.User;

@Service
public interface UserService {
	public User addDetails(User user);
	public User findByEmail(String email);

	
	
	

}
