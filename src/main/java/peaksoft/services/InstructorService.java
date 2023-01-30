package peaksoft.services;

import peaksoft.entity.Instructor;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public interface InstructorService {
    String saveInstructor(Instructor instructor);
    Instructor updateInstructor(Long instructorId, Instructor instructor);
    Instructor getInstructorById(Long instructorId);
    List<Instructor> getInstructorsByCourseId(Long courseId);
    String deleteInstructorById(Long instructorId);
    String assignInstructorToCourse(Long courseId, Long instructorId);
}
