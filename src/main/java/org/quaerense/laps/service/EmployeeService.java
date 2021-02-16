package org.quaerense.laps.service;

import org.quaerense.laps.domain.Employee;

import java.util.List;

public interface EmployeeService {
    void addEmployee(Employee employee);

    List<Employee> getEmployees();

    Employee getEmployeeById(Long id);

    Employee getEmployeeByUsername(String username);

    void updateEmployee(Employee employee);

    void deleteEmployee(Employee employee);
}
