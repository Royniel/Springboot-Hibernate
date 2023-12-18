package edu.neu.cyse0.pathfinder2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.neu.cyse0.pathfinder2.model.CourseRegistration;
import edu.neu.cyse0.pathfinder2.model.Dashboard;
import edu.neu.cyse0.pathfinder2.model.Profile;

@Controller
public class DashboardController {
	@GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("dashboard", new Dashboard());
        return "dashboard";
    }
	@PostMapping("/courseRegistrationDash")
    public String showCourses(CourseRegistration courseregistration) {
        
        return "courseRegistration";
    }
	@PostMapping("/profileDash")
    public String showProfile(Profile profile) {
        
        return "profile";
    }
	@PostMapping("/existingCoursesDash")
    public String showExistingCourses(Profile profile) {
        
        return "existingCourses";
    }
	
	@PostMapping("/dashboard")
        public String showLogin(Dashboard dashboard) {
        return "login";
        }
	

}
