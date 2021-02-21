package org.quaerense.laps.service;

import org.quaerense.laps.dao.EmployeeStatusDao;
import org.quaerense.laps.domain.EmployeeStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeStatusServiceImpl implements EmployeeStatusService {
    @Autowired
    private EmployeeStatusDao employeeStatusDao;

    @Override
    @Transactional
    public void addEmployeeStatus(EmployeeStatus employeeStatus) {
        employeeStatusDao.addEmployeeStatus(employeeStatus);
    }

    @Override
    @Transactional
    public List<EmployeeStatus> getEmployeeStatuses() {
        return employeeStatusDao.getEmployeeStatuses();
    }

    @Override
    @Transactional
    public EmployeeStatus getEmployeeStatusById(Long id) {
        return employeeStatusDao.getEmployeeStatusById(id);
    }

    @Override
    @Transactional
    public void updateEmployeeStatus(EmployeeStatus employeeStatus) {
        employeeStatusDao.updateEmployeeStatus(employeeStatus);
    }

    @Override
    @Transactional
    public void deleteEmployeeStatus(EmployeeStatus employeeStatus) {
        employeeStatusDao.deleteEmployeeStatus(employeeStatus);
    }
}
