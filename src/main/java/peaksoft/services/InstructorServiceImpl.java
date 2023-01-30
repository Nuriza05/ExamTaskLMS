package peaksoft.services;

import peaksoft.entity.Instructor;
import peaksoft.repository.InstructorRepository;
import peaksoft.repository.InstructorRepositoryImpl;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public class InstructorServiceImpl implements InstructorService{
    InstructorRepository instructorRepository = new InstructorRepositoryImpl();
    @Override
    public String saveInstructor(Instructor instructor) {
        return instructorRepository.saveInstructor(instructor);
    }

    @Override
    public Instructor updateInstructor(Long instructorId, Instructor instructor) {
        return instructorRepository.updateInstructor(instructorId,instructor);
    }

    @Override
    public Instructor getInstructorById(Long instructorId) {
        return instructorRepository.getInstructorById(instructorId);
    }

    @Override
    public List<Instructor> getInstructorsByCourseId(Long courseId) {
        return instructorRepository.getInstructorsByCourseId(courseId);
    }

    @Override
    public String deleteInstructorById(Long instructorId) {
        return instructorRepository.deleteInstructorById(instructorId);
    }

    @Override
    public String assignInstructorToCourse(Long courseId, Long instructorId) {
        return instructorRepository.assignInstructorToCourse(courseId,instructorId);
    }
}
