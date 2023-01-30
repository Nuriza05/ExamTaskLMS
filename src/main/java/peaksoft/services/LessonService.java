package peaksoft.services;

import peaksoft.entity.Lesson;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public interface LessonService {
    String saveLesson(Long courseId, Lesson lesson);
    Lesson updateLesson(Long lessonId, Lesson lesson);
    Lesson getLessonById(Long lessonId);
    List<Lesson> getLessonsByCourseId(Long courseId);
}
