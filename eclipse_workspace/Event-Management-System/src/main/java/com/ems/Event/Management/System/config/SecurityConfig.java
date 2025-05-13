package com.ems.Event.Management.System.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disable CSRF protection (for form login testing)
            .authorizeHttpRequests()
                .requestMatchers("/**").permitAll() // 🚀 Allow all requests
            .and()
            .formLogin().disable(); // 🚀 Disable Spring Security login form
        return http.build();
    }
}
