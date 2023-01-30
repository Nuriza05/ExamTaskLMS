package peaksoft.repository;

import jakarta.persistence.EntityManager;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Course;
import peaksoft.entity.Lesson;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public class LessonRepositoryImpl implements LessonRepository{
    EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public String  saveLesson(Long courseId, Lesson lesson) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        lesson.setCourse(course);
        entityManager.persist(lesson);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Successfully saved!";
    }

    @Override
    public Lesson updateLesson(Long lessonId, Lesson lesson) {
        entityManager.getTransaction().begin();
        Lesson lesson1 = entityManager.find(Lesson.class, lessonId);
        lesson1.setFirstName(lesson.getFirstName());
        lesson1.setVideoLink(lesson.getVideoLink());
        entityManager.getTransaction().commit();
        entityManager.close();
        return lesson1;
    }

    @Override
    public Lesson getLessonById(Long lessonId) {
        entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class, lessonId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return lesson;
    }

    @Override
    public List<Lesson> getLessonsByCourseId(Long courseId) {
        entityManager.getTransaction().begin();
        Course course = entityManager.find(Course.class, courseId);
        List<Lesson> lessons = new ArrayList<>(course.getLessons());
        entityManager.getTransaction().commit();
        entityManager.close();
        return lessons;
    }
}
