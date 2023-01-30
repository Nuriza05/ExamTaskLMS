package peaksoft.repository;
import jakarta.persistence.EntityManager;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Course;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public class CourseRepositoryImpl implements CourseRepository{
private final EntityManager entityManager =  HibernateConfig.getEntityManager();;
    @Override
    public String saveCourse(Course course) {
        entityManager.getTransaction().begin();
        entityManager.persist(course);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Course is successfully saved!";
    }

    @Override
    public Course getCourseById(Long courseId) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return course;
    }

    @Override
    public List<Course> getAllCourse(String ascOrDesc) {
        entityManager.getTransaction().begin();
        List<Course> fromCourse = null;
        if(ascOrDesc.equals("asc")) {
            fromCourse = entityManager.createQuery("from Course order by createAt", Course.class).getResultList();
        } else if (ascOrDesc.equals("desc")) {
            fromCourse = entityManager.createQuery("from Course order by createAt desc", Course.class).getResultList();
        }
        entityManager.getTransaction().commit();
        entityManager.close();
        return fromCourse;
    }

    @Override
    public Course updateCourse(Long courseId, Course course) {
        entityManager.getTransaction().begin();
        Course result = entityManager.find(Course.class, courseId);
        result.setCourseName(course.getCourseName());
        result.setDescription(course.getDescription());
        result.setDuration(course.getDuration());
        result.setCreateAt(course.getCreateAt());
        result.setImageLink(course.getImageLink());
        entityManager.getTransaction().commit();
        entityManager.close();
        return result;
    }

    @Override
    public String deleteCourseById(Long courseId) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        course.setInstructors(null);
        entityManager.remove(course);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Course is successfully deleted!";
    }

    @Override
    public Course getCourseByName(String courseName) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseName);
        entityManager.getTransaction().commit();
        entityManager.close();
        return course;
    }
}
