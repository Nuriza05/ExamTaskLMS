package peaksoft.repository;

import peaksoft.entity.Course;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public interface CourseRepository {
    String saveCourse(Course course);
    Course getCourseById(Long courseId);
    List<Course> getAllCourse(String ascOrDesc);
    Course updateCourse(Long courseId, Course course);
    String deleteCourseById(Long courseId);
    Course getCourseByName(String courseName);
}
