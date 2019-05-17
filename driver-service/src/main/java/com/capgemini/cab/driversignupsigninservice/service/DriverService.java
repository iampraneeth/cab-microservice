package com.capgemini.cab.driversignupsigninservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.capgemini.cab.driversignupsigninservice.entity.Driver;

@Service
public interface DriverService {

	public Driver addDetails(Driver driver);
	public Driver findByEmail(String email);
	public List<Driver> findAll();
	public Driver deleteByEmail(String email);

}
