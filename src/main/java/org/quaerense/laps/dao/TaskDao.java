package org.quaerense.laps.dao;

import org.quaerense.laps.domain.TaskStatus;
import org.quaerense.laps.domain.Task;

import java.util.List;

public interface TaskDao {
    void addTask(Task task);

    List<Task> getTasks();

    List<Task> getTasksByStatusAndEmployeeId(TaskStatus taskStatus, Long id);

    Task getTaskById(Long id);

    void updateTask(Task task);

    void deleteTask(Task task);
}
