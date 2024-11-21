package edu.miu.cse.coursemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="courses")
@NoArgsConstructor
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String courseName;
    private String courseCode;
    private String courseDescription;

    public Course(String courseName, String courseCode, String courseDescription) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseDescription = courseDescription;
    }
}
