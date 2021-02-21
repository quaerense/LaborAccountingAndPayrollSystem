package org.quaerense.laps.dao;

import org.quaerense.laps.domain.EmployeeStatus;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeStatusDaoJpa implements EmployeeStatusDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addEmployeeStatus(EmployeeStatus employeeStatus) {
        entityManager.persist(employeeStatus);
    }

    @Override
    public List<EmployeeStatus> getEmployeeStatuses() {
        return entityManager.createQuery("SELECT es FROM EmployeeStatus es", EmployeeStatus.class)
                .getResultList();
    }

    @Override
    public EmployeeStatus getEmployeeStatusById(Long id) {
        return entityManager.createQuery("SELECT es FROM EmployeeStatus es WHERE es.id = :id", EmployeeStatus.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void updateEmployeeStatus(EmployeeStatus employeeStatus) {
        entityManager.merge(employeeStatus);
    }

    @Override
    public void deleteEmployeeStatus(EmployeeStatus employeeStatus) {
        entityManager.remove(employeeStatus);
    }
}
