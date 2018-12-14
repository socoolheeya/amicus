package com.amicus.meet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amicus.meet.model.Meeting;

@Repository
public interface MeetRepository extends JpaRepository<Meeting, Long> {
	
}
