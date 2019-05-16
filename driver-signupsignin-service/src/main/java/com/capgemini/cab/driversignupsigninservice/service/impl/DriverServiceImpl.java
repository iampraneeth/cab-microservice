package com.capgemini.cab.driversignupsigninservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.cab.driversignupsigninservice.dao.DriverDao;
import com.capgemini.cab.driversignupsigninservice.entity.Driver;
import com.capgemini.cab.driversignupsigninservice.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	private DriverDao dao;

	@Override
	public Driver addDetails(Driver driver) {
		return dao.save(driver);
	}

	@Override
	public Driver findByEmail(String email) {
		return dao.findByEmail(email);
	}

	@Override
	public List<Driver> findAll() {
		System.out.println(dao.findAll());
		return dao.findAll();
	}

}
