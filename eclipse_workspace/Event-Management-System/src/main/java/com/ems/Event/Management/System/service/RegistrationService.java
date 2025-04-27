package com.ems.Event.Management.System.service;


import com.ems.Event.Management.System.dto.RegistrationDTO;
import com.ems.Event.Management.System.model.Registration;
import com.ems.Event.Management.System.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    @Autowired
    private RegistrationRepository registrationRepository;

    public Registration registerUserForEvent(Registration registration) {
        return registrationRepository.save(registration);
    }

    public List<Registration> getRegistrationsByUserId(Long userId) {
        return registrationRepository.findByUserId(userId);
    }

    public List<Registration> getRegistrationsByEventId(Long eventId) {
        return registrationRepository.findByEventId(eventId);
    }
    public List<RegistrationDTO> getAllRegistrationsWithDetails() {
        return registrationRepository.findAllRegistrationsWithDetails();
    }
    public long getRegistrationCount() {
        return registrationRepository.count();
    }
    



}
