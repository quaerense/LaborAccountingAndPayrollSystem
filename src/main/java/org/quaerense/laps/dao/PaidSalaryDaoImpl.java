package org.quaerense.laps.dao;

import org.quaerense.laps.domain.PaidSalary;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PaidSalaryDaoImpl implements PaidSalaryDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addPaidSalary(PaidSalary paidSalary) {
        entityManager.persist(paidSalary);
    }

    @Override
    public List<PaidSalary> getAllPaidSalariesByEmployeeId(Integer id) {
        return entityManager
                .createQuery("SELECT ps FROM PaidSalary ps WHERE ps.employee.id = :employeeId", PaidSalary.class)
                .setParameter("employeeId", id)
                .getResultList();
    }
}
