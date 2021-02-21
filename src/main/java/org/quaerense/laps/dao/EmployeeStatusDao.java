package org.quaerense.laps.dao;

import org.quaerense.laps.domain.EmployeeStatus;

import java.util.List;

public interface EmployeeStatusDao {
    void addEmployeeStatus(EmployeeStatus employeeStatus);

    List<EmployeeStatus> getEmployeeStatuses();

    EmployeeStatus getEmployeeStatusById(Long id);

    void updateEmployeeStatus(EmployeeStatus employeeStatus);

    void deleteEmployeeStatus(EmployeeStatus employeeStatus);
}
