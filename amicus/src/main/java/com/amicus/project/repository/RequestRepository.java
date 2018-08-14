package com.amicus.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amicus.project.model.Request;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {
	
	
}
