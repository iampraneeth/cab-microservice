package com.capgemini.cab.adminsigninservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.capgemini.cab.adminsigninservice.entity.Admin;

@Repository
public interface AdminDao extends JpaRepository<Admin, Long> {
	
	Admin findByEmail(String email);
}
