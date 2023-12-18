package edu.neu.cyse0.pathfinder2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import edu.neu.cyse0.pathfinder2.dao.CourseRegistrationDAO;
import edu.neu.cyse0.pathfinder2.model.CourseRegistration; // Assuming you have this model
import edu.neu.cyse0.pathfinder2.model.ExistingCourse;

import java.util.Arrays;
import java.util.List;

@Controller
public class CourseRegistrationController {

    @Autowired
    private CourseRegistrationDAO courseRegistrationDAO;

    @GetMapping("/courseRegistration")
    public String showCourseRegistrationForm(Model model) {
        model.addAttribute("courseRegistration", new CourseRegistration());
        return "courseRegistration";
    }

    @PostMapping("/courseRegistrationSubmit")
    public String processCourseRegistration(CourseRegistration registration, Model model) {
        List<Object[]> matchingCourses = courseRegistrationDAO.findCoursesByCriteria(
            registration.getFieldOfEducation(), 
            registration.getInterests(), 
            registration.getDuration()
        );
        System.out.println("your course is:" + matchingCourses);

        model.addAttribute("matchingCourses", matchingCourses);
        return "courseRegistration"; 
    }
    
    @PostMapping("/backtodashboard")
    public String showCourses(CourseRegistration courseregistration) {
        
        return "dashboard";
    }
}
