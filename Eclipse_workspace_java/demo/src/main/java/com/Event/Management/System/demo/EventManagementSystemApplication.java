package com.Event.Management.System.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

@SpringBootApplication(exclude = { UserDetailsServiceAutoConfiguration.class })
public class EventManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventManagementSystemApplication.class, args);
	}

}
