package com.capgemini.cab.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.cab.entity.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{

	User findByEmail(String email);
}
