package org.quaerense.laps.service;

import org.quaerense.laps.dao.DateDao;
import org.quaerense.laps.dao.EmployeeDao;
import org.quaerense.laps.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DateDao dateDao;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employee.setUsername(employee.getUsername().trim().toLowerCase());
        employee.setPassword(bCryptPasswordEncoder.encode(employee.getPassword()));
        employee.setDateOfEmployment(dateDao.getCurrentDate());

        employeeDao.addEmployee(employee);
    }

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(Long id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    @Transactional
    public Employee getEmployeeByUsername(String username) {
        return employeeDao.getEmployeeByUsername(username.toLowerCase());
    }

    @Override
    @Transactional
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }
}
