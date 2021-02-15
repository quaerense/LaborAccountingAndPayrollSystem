package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Status;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StatusDaoImpl implements StatusDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addStatus(Status status) {
        entityManager.persist(status);
    }

    @Override
    public List<Status> getStatuses() {
        return entityManager.createQuery("SELECT s FROM Status s", Status.class).getResultList();
    }

    @Override
    public void updateStatus(Status status) {
        entityManager.merge(status);
    }

    @Override
    public void deleteStatus(Status status) {
        entityManager.remove(status);
    }
}
