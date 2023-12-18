package edu.neu.cyse0.pathfinder2.dao;

import org.springframework.stereotype.Repository;

import edu.neu.cyse0.pathfinder2.model.Registration;
@Repository
public interface RegistrationDAO {
    void save(Registration registration);
    // Other methods as needed
}
