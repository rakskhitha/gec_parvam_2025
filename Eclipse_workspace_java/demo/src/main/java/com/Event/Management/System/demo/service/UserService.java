package com.Event.Management.System.demo.service;

import java.util.Optional;

import com.Event.Management.System.demo.dto.UserDTO;
import com.Event.Management.System.demo.model.User;
import com.Event.Management.System.demo.repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    // Constructor Injection
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public Optional<User> registerUser(UserDTO userDTO) {
        // Check if the user already exists
        if (userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
            return Optional.empty(); // User already exists
        }

        // Create a new User entity from the DTO
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        user.setPhone(userDTO.getPhone());
        user.setPassword(passwordEncoder.encode(userDTO.getPassword())); // Encrypt the password
        user.setRole("ROLE_" + userDTO.getRole().toUpperCase());

        // Save the user in the database
        return Optional.of(userRepository.save(user));
    }
}
