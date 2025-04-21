package Card.Display.Card.Display.CRUD.controller;

import Card.Display.Card.Display.CRUD.models.Profile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class ProfileController {

    // In-memory list of profiles (no DB)
    private List<Profile> profiles = new ArrayList<>();

    // Redirect root (/) to /profile
    @GetMapping("/")
    public String homeRedirect() {
        return "redirect:/profile";
    }

    // Display form and cards
    @GetMapping("/profile")
    public String showForm(Model model) {
        model.addAttribute("profile", new Profile());
        model.addAttribute("profiles", profiles);
        return "profile"; // Will render profile.html
    }

    // Handle form submission
    @PostMapping("/addProfile")
    public String addProfile(@ModelAttribute Profile profile) {
        profiles.add(profile);
        return "redirect:/profile";
    }

    // Handle deletion by index
    @GetMapping("/delete/{index}")
    public String deleteProfile(@PathVariable int index) {
        if (index >= 0 && index < profiles.size()) {
            profiles.remove(index);
        }
        return "redirect:/profile";
    }
}
