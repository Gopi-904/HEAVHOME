package interior.designer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping; // Import added

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/projects")
    public String projects() {
        return "projects";
    }

    @GetMapping("/services")
    public String services() {
        return "services";
    }

    @GetMapping("/founder")
    public String founder() {
        return "founder";
    }

    @GetMapping("/contact")
    public String contact() {
        return "contact";
    }

    // --- FIX FOR THE ERROR ---
    // This method handles the form submission when someone clicks "Send Message"
    @PostMapping("/contact")
    public String handleContactForm() {
        // For now, we redirect back to the contact section on the home page
        return "redirect:/#contact";
    }
}