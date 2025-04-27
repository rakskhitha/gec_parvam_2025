package com.ems.Event.Management.System.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "home"; // home.html
    }

    @GetMapping("/about")
    public String aboutPage() {
        return "about"; // about.html
    }

    @GetMapping("/contact")
    public String contactPage() {
        return "contact"; // contact.html
    }
}
