package com.capgemini.cab.adminsigninservice.service;

import org.springframework.stereotype.Service;

import com.capgemini.cab.adminsigninservice.entity.Admin;

@Service
public interface AdminService {

	public Admin findByEmail(String email);
	
}
