package com.Event.Management.System.demo.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Event.Management.System.demo.dto.UserDTO;
import com.Event.Management.System.demo.model.User;
import com.Event.Management.System.demo.service.UserService;

@Controller
public class HomeController {

	@GetMapping({"", "/" ,"index"})
	public String home() {
		return "index";
	}
	@GetMapping("/blog")
	public String blog() {
		return "blog";
	}
	@GetMapping("/testimonials")
	public String testimonials() {
		return "testimonials";
	}
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("userDTO", new UserDTO());
        return "register";
    }
	@GetMapping("servicess/birthday_parties")
	public String birthday_parties() {
		return "servicess/birthday_parties";
	}
	@GetMapping("servicess/corporate_events")
	public String corporate_events() {
		return "servicess/corporate_events";
	}
	@GetMapping("servicess/private_parties")
	public String private_parties() {
		return "servicess/private_parties";
	}
	@GetMapping("servicess/college_fests")
	public String college_fests() {
		return "servicess/college_fests";
	}
	@GetMapping("servicess/music_entertainment")
	public String music_entertainment() {
		return "servicess/music_entertainment";
	}
	@GetMapping("servicess/wedding_planners")
	public String wedding_planners() {
		return "servicess/wedding_planners";
	}
	@GetMapping("/gallery")
	public String gallery() {
		return "gallery";
	}
	@GetMapping("/contact_us")
	public String contact_us() {
		return "contact_us";
	}
	  private final UserService userService;

	    public HomeController(UserService userService) { // constructor injection, no @Autowired
	        this.userService = userService;
	    }

	    @PostMapping("/register")
	    public String registerUser(@ModelAttribute("userDTO") UserDTO userDTO, Model model) {
	        Optional<User> registeredUser = userService.registerUser(userDTO);
	        if (registeredUser.isEmpty()) {
	            model.addAttribute("registrationError", "Email already registered");
	            return "register";
	        }
	        return "redirect:/login";
	    }

	    @GetMapping("/admin/admin_dashboard")
		public String admin_dashboard() {
			return "/admin/admin_dashboard";
		}
	    @GetMapping("/organizer/organizer_dashboard")
		public String organizer_dashboard() {
			return "/organizer/organizer_dashboard";
		}
	    
}
