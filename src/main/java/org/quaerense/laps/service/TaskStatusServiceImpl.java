package org.quaerense.laps.service;

import org.quaerense.laps.dao.TaskStatusDao;
import org.quaerense.laps.domain.TaskStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskStatusServiceImpl implements TaskStatusService {
    @Autowired
    private TaskStatusDao taskStatusDao;

    @Override
    @Transactional
    public void addTaskStatus(TaskStatus taskStatus) {
        taskStatusDao.addTaskStatus(taskStatus);
    }

    @Override
    @Transactional
    public List<TaskStatus> getTaskStatuses() {
        return taskStatusDao.getTaskStatuses();
    }

    @Override
    @Transactional
    public void updateTaskStatus(TaskStatus taskStatus) {
        taskStatusDao.updateTaskStatus(taskStatus);
    }

    @Override
    @Transactional
    public void deleteTaskStatus(TaskStatus taskStatus) {
        taskStatusDao.deleteTaskStatus(taskStatus);
    }
}
