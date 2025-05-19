package com.Event.Management.System.demo.controller;



import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.Event.Management.System.demo.service.UserService;

import jakarta.servlet.http.HttpServletRequest;

public class OrganizerController {
 

	
	
	  private final UserService userService;

	    public OrganizerController(UserService userService) { 
	        this.userService = userService;
	    }
	    @GetMapping("/organizer/organizer_dashboard")
		
    	
    	public String organizer_dashboard(HttpServletRequest request, Model model) {
	    	String login_success_msg = (String) request.getSession().getAttribute("login_success");
	    	if(login_success_msg != null) {
	    		model.addAttribute("success",login_success_msg);
	    		request.getSession().removeAttribute("login_success");
	    	}
		return "/organizer/organizer_dashboard";
	}
}

