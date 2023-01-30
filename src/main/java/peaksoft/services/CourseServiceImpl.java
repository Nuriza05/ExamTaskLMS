package peaksoft.services;

import peaksoft.entity.Course;
import peaksoft.repository.CourseRepository;
import peaksoft.repository.CourseRepositoryImpl;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public class CourseServiceImpl implements CourseService{
    CourseRepository courseRepository = new CourseRepositoryImpl();
    @Override
    public String saveCourse(Course course) {
        return courseRepository.saveCourse(course);
    }

    @Override
    public Course getCourseById(Long courseId) {
        return courseRepository.getCourseById(courseId);
    }

    @Override
    public List<Course> getAllCourse(String ascOrDesc) {
        return courseRepository.getAllCourse(ascOrDesc);
    }

    @Override
    public Course updateCourse(Long courseId, Course course) {
        return courseRepository.updateCourse(courseId,course);
    }

    @Override
    public String deleteCourseById(Long courseId) {
        return courseRepository.deleteCourseById(courseId);
    }

    @Override
    public Course getCourseByName(String courseName) {
        return courseRepository.getCourseByName(courseName);
    }
}
