package edu.miu.cse.coursemanagement.repository;

import edu.miu.cse.coursemanagement.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
