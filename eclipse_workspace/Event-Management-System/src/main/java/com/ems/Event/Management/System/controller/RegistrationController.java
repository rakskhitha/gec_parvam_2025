package com.ems.Event.Management.System.controller;

import com.ems.Event.Management.System.dto.RegistrationDTO;
import com.ems.Event.Management.System.model.Registration;
import com.ems.Event.Management.System.model.User;
import com.ems.Event.Management.System.service.RegistrationService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping("/registrations")
public class RegistrationController {

    @Autowired
    private RegistrationService registrationService;

    // Register for an event
    @GetMapping("/register/{eventId}")
    public String registerForEvent(@PathVariable Long eventId, HttpSession session) {
        Registration registration = new Registration();
        registration.setEventId(eventId);

        User loggedInUser = (User) session.getAttribute("loggedInUser");
        if (loggedInUser != null) {
            registration.setUserId(loggedInUser.getId());
        } else {
            return "redirect:/users/login"; // if not logged in
        }

        registration.setRegistrationDate(LocalDateTime.now());
        registrationService.registerUserForEvent(registration);

        return "redirect:/registrations/success";
    }

    // Show Registration Success Page
    @GetMapping("/success")
    public String registrationSuccess() {
        return "registration_success"; // registration_success.html
    }

    // API: Register User by JSON
    @PostMapping("/register")
    @ResponseBody
    public Registration registerUserForEvent(@RequestBody Registration registration) {
        registration.setRegistrationDate(LocalDateTime.now());
        return registrationService.registerUserForEvent(registration);
    }

    // API: Get registrations by user
    @GetMapping("/user/{userId}")
    @ResponseBody
    public List<Registration> getRegistrationsByUser(@PathVariable Long userId) {
        return registrationService.getRegistrationsByUserId(userId);
    }

    // API: Get registrations by event
    @GetMapping("/event/{eventId}")
    @ResponseBody
    public List<Registration> getRegistrationsByEvent(@PathVariable Long eventId) {
        return registrationService.getRegistrationsByEventId(eventId);
    }
    @GetMapping("/all")
    public String getAllRegistrations(Model model) {
        List<RegistrationDTO> registrations = registrationService.getAllRegistrationsWithDetails();
        model.addAttribute("registrations", registrations);
        return "registration_list"; // Show table with full info
    }

}
