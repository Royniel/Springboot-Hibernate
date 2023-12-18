// CourseDAO.java
package edu.neu.cyse0.pathfinder2.dao;

import java.util.List;
import edu.neu.cyse0.pathfinder2.model.ExistingCourse;

public interface CourseDAO {
    List<ExistingCourse> findAll();
    List<Object[]> findByCategory(String category);
}
