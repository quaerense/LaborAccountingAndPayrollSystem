package org.quaerense.dao;

import org.quaerense.domain.Task;

import java.util.List;

public interface TaskDao {
    void addTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    void updateTask(Task task);

    void deleteTask(Task task);
}
