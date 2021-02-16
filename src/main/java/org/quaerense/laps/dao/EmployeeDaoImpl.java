package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Employee;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addEmployee(Employee employee) {
        entityManager.persist(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return entityManager.createQuery("SELECT e FROM Employee e", Employee.class).getResultList();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee getEmployeeByUsername(String username) {
        return entityManager.createQuery("SELECT e FROM Employee e WHERE e.username = :username", Employee.class)
                .setParameter("username", username)
                .getSingleResult();
    }

    @Override
    public void updateEmployee(Employee employee) {
        entityManager.merge(employee);
    }

    @Override
    public void deleteEmployee(Employee employee) {
        entityManager.remove(employee);
    }
}
