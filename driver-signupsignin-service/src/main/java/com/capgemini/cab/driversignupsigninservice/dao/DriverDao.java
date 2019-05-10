package com.capgemini.cab.driversignupsigninservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.cab.driversignupsigninservice.entity.Driver;

@Repository
public interface DriverDao extends JpaRepository<Driver, Long>{

	Driver findByEmail(String email);
}
