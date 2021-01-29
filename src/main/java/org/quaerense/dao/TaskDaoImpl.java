package org.quaerense.dao;

import org.quaerense.domain.Task;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TaskDaoImpl implements TaskDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addTask(Task task) {
        entityManager.persist(task);
    }

    @Override
    public List<Task> getAllTasks() {
        return entityManager.createQuery("SELECT t FROM Task t", Task.class).getResultList();
    }

    @Override
    public Task getTaskById(Long id) {
        return entityManager.find(Task.class, id);
    }

    @Override
    public void updateTask(Task task) {
        entityManager.merge(task);
    }

    @Override
    public void deleteTask(Task task) {
        entityManager.remove(task);
    }
}
