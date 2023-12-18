package edu.neu.cyse0.pathfinder2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


import edu.neu.cyse0.pathfinder2.model.LoginForm;

import edu.neu.cyse0.pathfinder2.service.UserService;

@Controller
public class LoginFormController {

	@Autowired
    private UserService userService; 
	
    @GetMapping("/login")
    public String showLoginForm(Model model) {
        model.addAttribute("loginForm", new LoginForm());
        return "login";
    }
    @PostMapping("/login")
    public String loginSubmit(LoginForm loginForm, Model model) {
        // Implement authentication logic here
        // For simplicity, let's assume a basic authentication check
    	
    	boolean isAuthenticated = userService.authenticate(loginForm.getUsername(), loginForm.getPassword());
        if (isAuthenticated) {
        	System.out.println("Is Authenticated: " + isAuthenticated);
        	return "redirect:dashboard";
            // Redirect to dashboard view if authenticated
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "redirect:login?error"; // Redirect back to login page with error
        }
    	
       
    }
}