package org.quaerense.dao;

import org.quaerense.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    void addEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee getEmployeeById(Integer id);

    Employee getEmployeeByLogin(String login);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
