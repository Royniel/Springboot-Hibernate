package edu.neu.cyse0.pathfinder2.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.util.List;

@Entity
@Table(name="courses")
public class CourseRegistration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "educationLevel")
    private String educationLevel;

    @Column(name = "educationField")
    private String fieldOfEducation;

    @Column(name = "interests")
    private String interests; 

    @Column(name = "purpose")
    private String purpose;

    @Column(name = "duration")
    private String duration;

  

    public CourseRegistration() {
    }

    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEducationLevel() {
        return educationLevel;
    }

    public void setEducationLevel(String educationLevel) {
        this.educationLevel = educationLevel;
    }

    public String getFieldOfEducation() {
        return fieldOfEducation;
    }

    public void setFieldOfEducation(String fieldOfEducation) {
        this.fieldOfEducation = fieldOfEducation;
    }

    public String getInterests() {
        return interests;
    }

    public void setInterests(String interests) {
        this.interests = interests;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
