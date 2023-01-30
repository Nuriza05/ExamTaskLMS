package peaksoft.services;

import peaksoft.entity.Lesson;
import peaksoft.repository.LessonRepository;
import peaksoft.repository.LessonRepositoryImpl;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public class LessonServiceImpl implements LessonService{
    LessonRepository lessonRepository = new LessonRepositoryImpl();
    @Override
    public String saveLesson(Long courseId, Lesson lesson) {
        return lessonRepository.saveLesson(courseId,lesson);
    }

    @Override
    public Lesson updateLesson(Long lessonId, Lesson lesson) {
        return lessonRepository.updateLesson(lessonId,lesson);
    }

    @Override
    public Lesson getLessonById(Long lessonId) {
        return lessonRepository.getLessonById(lessonId);
    }

    @Override
    public List<Lesson> getLessonsByCourseId(Long courseId) {
        return lessonRepository.getLessonsByCourseId(courseId);
    }
}
