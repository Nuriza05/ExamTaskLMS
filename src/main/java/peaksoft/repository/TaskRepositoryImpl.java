package peaksoft.repository;

import jakarta.persistence.EntityManager;
import peaksoft.config.HibernateConfig;
import peaksoft.entity.Lesson;
import peaksoft.entity.Task;

import java.util.ArrayList;
import java.util.List;

/**
 * @created : Lenovo Nuriza
 **/
public class TaskRepositoryImpl implements TaskRepository {
    EntityManager entityManager = HibernateConfig.getEntityManager();
    @Override
    public String saveTask(Task task) {
        entityManager.getTransaction().begin();
        entityManager.persist(task);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Task is successfully saved!";
    }

    @Override
    public Task updateTask(Long taskId, Task task) {
        entityManager.getTransaction().begin();
        Task task1 = entityManager.find(Task.class, taskId);
        task1.setTaskName(task.getTaskName());
        task1.setDeadline(task.getDeadline());
        task1.setTask(task.getTask());
        entityManager.getTransaction().commit();
        entityManager.close();
        return task1;
    }

    @Override
    public List<Task> getAllTaskByLessonId(Long lessonId) {
        entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class, lessonId);
        entityManager.getTransaction().commit();
        entityManager.close();
        return lesson.getTasks();
    }

    @Override
    public String deleteTaskById(Long taskId) {
        entityManager.getTransaction().begin();
        Task task = entityManager.find(Task.class, taskId);
        entityManager.remove(task);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Task is successfully removed!";
    }

    @Override
    public String assignTaskToLesson(Long lessonId, Long taskId) {
      entityManager.getTransaction().begin();
        Lesson lesson = entityManager.find(Lesson.class, lessonId);
        Task task = entityManager.find(Task.class, taskId);
        List<Task> tasks = new ArrayList<>(lesson.getTasks());
        tasks.add(task);
        lesson.setTasks(tasks);
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Task is successfully assigned to lesson";
    }
}
