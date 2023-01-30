package peaksoft.repository;

import jakarta.persistence.EntityManager;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Course;
import peaksoft.entity.Instructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public class InstructorRepositoryImpl implements InstructorRepository{
    EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public String saveInstructor(Instructor instructor) {
        entityManager.getTransaction().begin();
        entityManager.persist(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Instructor is successfully saved!";
    }

    @Override
    public Instructor updateInstructor(Long instructorId, Instructor instructor) {
        entityManager.getTransaction().begin();
        Instructor result = entityManager.find(Instructor.class, instructorId);
        result.setFirstName(instructor.getFirstName());
        result.setLastName(instructor.getLastName());
        result.setEmail(instructor.getEmail());
        result.setPhoneNumber(instructor.getPhoneNumber());
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }

    @Override
    public Instructor getInstructorById(Long instructorId) {
        entityManager.getTransaction().begin();
        Instructor instructor = entityManager.find(Instructor.class, instructorId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return instructor;
    }

    @Override
    public List<Instructor> getInstructorsByCourseId(Long courseId) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        List<Instructor> instructors = new ArrayList<>(course.getInstructors());
        entityManager.getTransaction().commit();
        entityManager.close();
        return instructors;
    }

    @Override
    public String deleteInstructorById(Long instructorId) {
        entityManager.getTransaction().begin();
        Instructor instructor = entityManager.find(Instructor.class, instructorId);
        entityManager.remove(instructor);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Instructor is successfully removed!";
    }

    @Override
    public String assignInstructorToCourse(Long courseId, Long instructorId) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        Instructor instructor = entityManager.find(Instructor.class, instructorId);
        List<Instructor> instructors = new ArrayList<>(course.getInstructors());
        instructors.add(instructor);
        course.setInstructors(instructors);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Instructor is successfully assigned to course!";
    }
}
