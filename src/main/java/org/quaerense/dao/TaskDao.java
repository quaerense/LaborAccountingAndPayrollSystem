package org.quaerense.dao;

import org.quaerense.domain.Status;
import org.quaerense.domain.Task;

import java.util.List;

public interface TaskDao {
    void addTask(Task task);

    List<Task> getTasks();

    List<Task> getTasksByStatusAndEmployeeId(Status status, Integer id);

    Task getTaskById(Long id);

    void updateTask(Task task);

    void deleteTask(Task task);
}
