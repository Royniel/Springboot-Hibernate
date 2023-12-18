package edu.neu.cyse0.pathfinder2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import edu.neu.cyse0.pathfinder2.dao.CourseDAO;
import edu.neu.cyse0.pathfinder2.model.CourseRegistration;
import edu.neu.cyse0.pathfinder2.model.ExistingCourse;

@Controller
public class CourseController {

    @Autowired
    private CourseDAO courseDAO;

    @GetMapping("/existingCourses")
    public String showExistingCourses(@RequestParam(required = false) String category, Model model) {
        List<Object[]> results = courseDAO.findByCategory(category);
        List<ExistingCourse> courses = new ArrayList<ExistingCourse>();

        for (Object[] result : results) {
            String name = (String) result[0];
            String duration = (String) result[1];
            category=(String) result[2];
            courses.add(new ExistingCourse(name, duration, category));
            System.out.println(name);
        }

        model.addAttribute("courses", courses);
        return "existingCourses"; // Name of the view (e.g., Thymeleaf template)
    }
    @PostMapping("/existingCoursesAll")
    public String showAllCourses(Model model) {
        List<ExistingCourse> courses = courseDAO.findAll();
        model.addAttribute("courses", courses);
        return "existingCourses"; 
    }
    
   
    
    
    @PostMapping("/backtodash")
    public String showCourses(ExistingCourse courses) {
        
        return "redirect:dashboard";
    }
}
