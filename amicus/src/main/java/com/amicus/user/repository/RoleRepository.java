package com.amicus.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amicus.user.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	public Role findByName(String name); 
}
