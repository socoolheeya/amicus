package com.amicus.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amicus.user.model.User;

public interface MainRepository extends JpaRepository<User, Long> {
	
}
