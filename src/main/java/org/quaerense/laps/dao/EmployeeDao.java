package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Employee;

import java.util.List;

public interface EmployeeDao {
    void addEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee getEmployeeById(Integer id);

    Employee getEmployeeByUsername(String username);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
