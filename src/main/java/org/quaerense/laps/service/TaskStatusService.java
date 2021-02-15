package org.quaerense.laps.service;

import org.quaerense.laps.domain.TaskStatus;

import java.util.List;

public interface TaskStatusService {
    void addTaskStatus(TaskStatus taskStatus);

    List<TaskStatus> getTaskStatuses();

    void updateTaskStatus(TaskStatus taskStatus);

    void deleteTaskStatus(TaskStatus taskStatus);
}
