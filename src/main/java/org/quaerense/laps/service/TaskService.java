package org.quaerense.laps.service;

import org.quaerense.laps.domain.TaskStatus;
import org.quaerense.laps.domain.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);

    List<Task> getTasks();

    List<Task> getTasksByStatusAndEmployeeId(TaskStatus taskStatus, Integer id);

    Task getTaskById(Long id);

    void updateTask(Task task);

    void deleteTask(Task task);
}
