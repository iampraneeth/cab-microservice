package com.capgemini.cab.adminsigninservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.cab.adminsigninservice.dao.AdminDao;
import com.capgemini.cab.adminsigninservice.entity.Admin;
import com.capgemini.cab.adminsigninservice.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminDao dao;
	
	@Override
	public Admin findByEmail(String email) {
		return dao.findByEmail(email);
	}

}
