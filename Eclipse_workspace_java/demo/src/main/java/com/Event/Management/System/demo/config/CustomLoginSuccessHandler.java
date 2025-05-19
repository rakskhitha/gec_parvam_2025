package com.Event.Management.System.demo.config;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

import java.io.IOException;
import java.util.Set;

public class CustomLoginSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, 
                                        HttpServletResponse response, 
                                        Authentication authentication) throws IOException, ServletException {
        Set<String> roles = AuthorityUtils.authorityListToSet(authentication.getAuthorities());
        request.getSession().setAttribute("login_success", "Login successfull.");

        if (roles.contains("ROLE_ADMIN")) {
            response.sendRedirect("/admin/admin_dashboard");
        } else if (roles.contains("ROLE_ORGANIZER")) {
            response.sendRedirect("/organizer/organizer_dashboard");
        } else {
            response.sendRedirect("/index");
        }
    }
}
