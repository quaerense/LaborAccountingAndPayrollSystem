package org.quaerense.dao;

import org.quaerense.domain.Employee;
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
    public Employee getEmployeeById(Integer id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee getEmployeeByLogin(String login) {
        return entityManager.createQuery("SELECT e FROM Employee e WHERE e.login = :login", Employee.class)
                .setParameter("login", login)
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
