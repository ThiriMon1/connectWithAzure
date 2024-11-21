package edu.miu.cse.coursemanagement.service;

import edu.miu.cse.coursemanagement.dto.request.CourseRequestDTO;
import edu.miu.cse.coursemanagement.dto.response.CourseResponseDTO;

import java.util.List;
import java.util.Optional;

public interface CourseService {
    Optional<CourseResponseDTO> createCourse(CourseRequestDTO courseRequestDTO);
    List<CourseResponseDTO> getAllCourses();
}
