package org.quaerense.service;

import org.quaerense.dao.TaskDao;
import org.quaerense.domain.Status;
import org.quaerense.domain.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskDao taskDao;

    @Override
    @Transactional
    public void addTask(Task task) {
        taskDao.addTask(task);
    }

    @Override
    @Transactional
    public List<Task> getTasks() {
        return taskDao.getTasks();
    }

    @Override
    @Transactional
    public List<Task> getTasksByStatusAndEmployeeId(Status status, Integer id) {
        return taskDao.getTasksByStatusAndEmployeeId(status, id);
    }

    @Override
    @Transactional
    public Task getTaskById(Long id) {
        return taskDao.getTaskById(id);
    }

    @Override
    @Transactional
    public void updateTask(Task task) {
        taskDao.updateTask(task);
    }

    @Override
    @Transactional
    public void deleteTask(Task task) {
        taskDao.deleteTask(task);
    }
}
