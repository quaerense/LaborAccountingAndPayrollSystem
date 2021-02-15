package org.quaerense.laps.dao;

import org.quaerense.laps.domain.TaskStatus;

import java.util.List;

public interface TaskStatusDao {
    void addTaskStatus(TaskStatus taskStatus);

    List<TaskStatus> getTaskStatuses();

    void updateTaskStatus(TaskStatus taskStatus);

    void deleteTaskStatus(TaskStatus taskStatus);
}
