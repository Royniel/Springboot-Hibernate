package edu.neu.cyse0.pathfinder2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import edu.neu.cyse0.pathfinder2.dao.RegistrationDAO;
import edu.neu.cyse0.pathfinder2.model.Registration;

@Controller
public class RegistrationController {

    @Autowired
    private RegistrationDAO registrationDAO;

    @GetMapping("/register")
    public String showRegistrationForm(Model model) {
        model.addAttribute("registration", new Registration());
        return "register"; 
    }

    @PostMapping("/register")
    public String processRegistration(@ModelAttribute Registration registration) {
        registrationDAO.save(registration);
        return "redirect:/login"; // Redirect after successful registration
    }
}
