package peaksoft.services;

import peaksoft.entity.Task;
import peaksoft.repository.TaskRepository;
import peaksoft.repository.TaskRepositoryImpl;

import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public class TaskServiceImpl implements TaskService{
    TaskRepository taskRepository = new TaskRepositoryImpl();
    @Override
    public String saveTask(Task task) {
        return taskRepository.saveTask(task);
    }

    @Override
    public Task updateTask(Long taskId, Task task) {
        return taskRepository.updateTask(taskId,task);
    }

    @Override
    public List<Task> getAllTaskByLessonId(Long lessonId) {
        return taskRepository.getAllTaskByLessonId(lessonId);
    }

    @Override
    public String deleteTaskById(Long taskId) {
        return taskRepository.deleteTaskById(taskId);
    }

    @Override
    public String assignTaskToLesson(Long lessonId, Long taskId) {
        return taskRepository.assignTaskToLesson(lessonId,taskId);
    }
}
