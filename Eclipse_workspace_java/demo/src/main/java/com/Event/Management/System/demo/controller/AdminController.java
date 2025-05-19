package com.Event.Management.System.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Event.Management.System.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

public class AdminController {

	
	
	  private final UserService userService;

	    public AdminController(UserService userService) { 
	        this.userService = userService;
	    }
	    @GetMapping("/admin/admin_dashboard")
		public String admin_dashboard(HttpServletRequest request, Model model) {
	    	String login_success_msg = (String) request.getSession().getAttribute("login_success");
	    	if(login_success_msg != null) {
	    		model.addAttribute("success",login_success_msg);
	    		request.getSession().removeAttribute("login_success");
	    	}
			return "/admin/admin_dashboard";
		}
}

