package edu.neu.cyse0.pathfinder2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import edu.neu.cyse0.pathfinder2.dao.ProfileDAO;

@Controller
public class ProfileController {

    @Autowired
    private ProfileDAO profileDAO;

    @GetMapping("/profile")
    public String showProfile(Model model) {
        // Assuming the email is obtained from the logged-in user
        String email = "royniel08@gmail.com";
        model.addAttribute("profile", profileDAO.getProfileByEmail(email));
        System.out.println(email);
        return "profile";
    }
}
