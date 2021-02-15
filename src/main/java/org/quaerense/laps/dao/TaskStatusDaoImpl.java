package org.quaerense.laps.dao;

import org.quaerense.laps.domain.TaskStatus;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class TaskStatusDaoImpl implements TaskStatusDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addTaskStatus(TaskStatus taskStatus) {
        entityManager.persist(taskStatus);
    }

    @Override
    public List<TaskStatus> getTaskStatuses() {
        return entityManager.createQuery("SELECT s FROM TaskStatus s", TaskStatus.class).getResultList();
    }

    @Override
    public void updateTaskStatus(TaskStatus taskStatus) {
        entityManager.merge(taskStatus);
    }

    @Override
    public void deleteTaskStatus(TaskStatus taskStatus) {
        entityManager.remove(taskStatus);
    }
}
