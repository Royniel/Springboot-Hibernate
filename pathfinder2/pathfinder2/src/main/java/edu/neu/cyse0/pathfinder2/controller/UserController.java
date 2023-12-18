package edu.neu.cyse0.pathfinder2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.neu.cyse0.pathfinder2.model.CourseRegistration;
import edu.neu.cyse0.pathfinder2.model.Dashboard;
import edu.neu.cyse0.pathfinder2.model.LoginForm;
import edu.neu.cyse0.pathfinder2.model.Registration;
import edu.neu.cyse0.pathfinder2.service.UserService;

@Controller
public class UserController {
	

    
    
   
  
    @GetMapping("/openModal")
    public String openModal(Model model) {
        model.addAttribute("showModal", true);
        return "modal";
    }

    @PostMapping("/closeModal")
    public String closeModal(Model model) {
        model.addAttribute("showModal", false);
        return "modal";
    }
}