package com.ems.Event.Management.System.controller;

import com.ems.Event.Management.System.model.User;
import com.ems.Event.Management.System.service.UserService;
import com.ems.Event.Management.System.service.EventService;
import com.ems.Event.Management.System.service.RegistrationService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private EventService eventService;

    @Autowired
    private RegistrationService registrationService; // ✅ Add RegistrationService

    // Show Registration Form
    @GetMapping("/register")
    public String showRegisterForm() {
        return "register"; // register.html
    }

    // Handle Registration Form Submission
    @PostMapping("/register")
    public String registerUser(@RequestParam String username,
                                @RequestParam String email,
                                @RequestParam String password,
                                @RequestParam String role,
                                Model model) {
        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setRole(role.toUpperCase());
        userService.registerUser(user);

        return "redirect:/users/login"; // after registration, redirect to login
    }

    // Show Login Form
    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // login.html
    }

    // Handle Login Form Submission
    @PostMapping("/login")
    public String loginUser(@RequestParam String username,
                             @RequestParam String password,
                             Model model,
                             HttpSession session) {
        User user = userService.findUserByUsername(username);

        if (user != null && user.getPassword().equals(password)) {
            session.setAttribute("loggedInUser", user);

            String role = user.getRole();
            if ("ADMIN".equalsIgnoreCase(role)) {
                model.addAttribute("user", user);
                model.addAttribute("userCount", userService.getUserCount());
                model.addAttribute("eventCount", eventService.getEventCount());
                model.addAttribute("registrationCount", registrationService.getRegistrationCount());
                return "admin_dashboard"; // admin_dashboard.html
            } else if ("ORGANIZER".equalsIgnoreCase(role)) {
                model.addAttribute("user", user);
                model.addAttribute("events", eventService.getAllEvents());
                return "organizer_dashboard"; // organizer_dashboard.html
            } else if ("PARTICIPANT".equalsIgnoreCase(role)) {
                model.addAttribute("user", user);
                model.addAttribute("events", eventService.getAllEvents());
                return "participant_dashboard"; // participant_dashboard.html
            } else {
                model.addAttribute("error", "Unknown Role!");
                return "login";
            }
        } else {
            model.addAttribute("error", "Invalid Username or Password!");
            return "login";
        }
    }

    // API: Get User by Username
    @GetMapping("/{username}")
    @ResponseBody
    public User getUserByUsername(@PathVariable String username) {
        return userService.findUserByUsername(username);
    }

    // API: Get All Users
    @GetMapping("/all")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
