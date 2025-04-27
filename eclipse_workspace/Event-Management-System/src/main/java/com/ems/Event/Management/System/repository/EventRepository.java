package com.ems.Event.Management.System.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.Event.Management.System.model.Event;

public interface EventRepository extends JpaRepository<Event, Long>{
	List<Event> findByCreatedBy(Long createdBy);
}
