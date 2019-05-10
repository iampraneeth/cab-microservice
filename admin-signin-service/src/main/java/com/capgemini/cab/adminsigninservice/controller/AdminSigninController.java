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

	@GetMapping("/login/{email}/{password}")
	public ResponseEntity<Admin> logInDetailsForAdmin(@PathVariable String email, @PathVariable String password)
			 {

		Admin status = service.findByEmail(email);
		System.out.println(email);
		if(status==null) {
			return new ResponseEntity<Admin>(status,HttpStatus.UNAUTHORIZED);
		}

		if ((status.getEmail().equals(email) && (status.getPassword().equals(password)))) {

			return new ResponseEntity<Admin>(status, HttpStatus.ACCEPTED);
		}

		return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);

	}
}
