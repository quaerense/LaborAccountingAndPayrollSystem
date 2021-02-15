package org.quaerense.laps.service;

import org.quaerense.laps.domain.Status;
import org.quaerense.laps.domain.Task;

import java.util.List;

public interface TaskService {
    void addTask(Task task);

    List<Task> getTasks();

    List<Task> getTasksByStatusAndEmployeeId(Status status, Integer id);

    Task getTaskById(Long id);

    void updateTask(Task task);

    void deleteTask(Task task);
}
