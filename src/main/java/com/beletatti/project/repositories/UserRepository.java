package com.beletatti.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.beletatti.project.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}


