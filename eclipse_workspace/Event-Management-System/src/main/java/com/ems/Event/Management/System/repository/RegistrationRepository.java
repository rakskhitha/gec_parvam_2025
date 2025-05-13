package com.ems.Event.Management.System.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ems.Event.Management.System.dto.RegistrationDTO;
import com.ems.Event.Management.System.model.Registration;

public interface RegistrationRepository  extends JpaRepository<Registration, Long>{
	 List<Registration> findByUserId(Long userId);
	    List<Registration> findByEventId(Long eventId);
	    @Query("SELECT new com.ems.Event.Management.System.dto.RegistrationDTO(r.id, u.username, e.name, r.registrationDate) " +
	    	       "FROM Registration r " +
	    	       "JOIN User u ON r.userId = u.id " +
	    	       "JOIN Event e ON r.eventId = e.id")
	    	List<RegistrationDTO> findAllRegistrationsWithDetails();

}
