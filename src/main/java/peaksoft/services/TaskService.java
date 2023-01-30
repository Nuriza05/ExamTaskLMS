package peaksoft.services;

import peaksoft.entity.Task;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public interface TaskService {
    String saveTask(Task task);
    Task updateTask(Long taskId, Task task);
    List<Task> getAllTaskByLessonId(Long lessonId);
    String deleteTaskById(Long taskId);
    String assignTaskToLesson(Long lessonId, Long taskId);
}
