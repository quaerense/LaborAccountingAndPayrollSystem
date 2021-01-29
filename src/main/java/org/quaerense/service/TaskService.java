package org.quaerense.service;

import org.quaerense.domain.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);

    List<Task> getAllTasks();

    Task getTaskById(Long id);

    void updateTask(Task task);

    void deleteTask(Task task);
}
