package edu.neu.cyse0.pathfinder2.dao;

import edu.neu.cyse0.pathfinder2.model.Profile;

public interface ProfileDAO {
    Profile getProfileByEmail(String email);
}
