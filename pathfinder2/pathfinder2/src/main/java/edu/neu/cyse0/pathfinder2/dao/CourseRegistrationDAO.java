package edu.neu.cyse0.pathfinder2.dao;

import edu.neu.cyse0.pathfinder2.model.CourseRegistration;
import edu.neu.cyse0.pathfinder2.model.ExistingCourse;
import java.util.List;

public interface CourseRegistrationDAO {
    
    List<Object[]> findCoursesByCriteria(String fieldOfEducation, String interests, String duration);
}
