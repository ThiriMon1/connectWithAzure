package edu.miu.cse.coursemanagement.dto.request;

public record CourseRequestDTO(
        String courseName,
        String courseCode,
        String courseDescription
) {
}
