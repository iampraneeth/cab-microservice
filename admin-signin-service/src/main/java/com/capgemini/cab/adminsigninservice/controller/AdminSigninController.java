package com.capgemini.cab.adminsigninservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.cab.adminsigninservice.entity.Admin;
import com.capgemini.cab.adminsigninservice.service.AdminService;

@RestController
@CrossOrigin("*")
public class AdminSigninController {

	@Autowired
	private AdminService service;

	@GetMapping("/login")
	public ResponseEntity<Admin> logInDetailsForAdmin() {
		Admin admin=new Admin();
		return new ResponseEntity<Admin>(admin,HttpStatus.FOUND);

	}

}
