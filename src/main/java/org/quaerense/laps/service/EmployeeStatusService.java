package org.quaerense.laps.service;

import org.quaerense.laps.domain.EmployeeStatus;

import java.util.List;

public interface EmployeeStatusService {
    void addEmployeeStatus(EmployeeStatus employeeStatus);

    List<EmployeeStatus> getEmployeeStatuses();

    EmployeeStatus getEmployeeStatusById(Long id);

    void updateEmployeeStatus(EmployeeStatus employeeStatus);

    void deleteEmployeeStatus(EmployeeStatus employeeStatus);
}
