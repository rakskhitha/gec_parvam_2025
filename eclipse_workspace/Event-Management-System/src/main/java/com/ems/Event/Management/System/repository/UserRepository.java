package com.ems.Event.Management.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.Event.Management.System.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	 User findByUsername(String username);
}
