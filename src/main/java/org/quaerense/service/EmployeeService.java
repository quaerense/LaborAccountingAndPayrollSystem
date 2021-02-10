package org.quaerense.service;

import org.quaerense.domain.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee getEmployeeById(Integer id);

    Employee getEmployeeByUsername(String username);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
