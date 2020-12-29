package com.orange.bank.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orange.bank.entities.User;

public interface UserRepositories extends JpaRepository<User, Long>{
	
	User findByEmail(String email);

}
