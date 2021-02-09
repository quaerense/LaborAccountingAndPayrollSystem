package org.quaerense.service;

import org.quaerense.dao.DateDao;
import org.quaerense.dao.EmployeeDao;
import org.quaerense.dao.RoleDao;
import org.quaerense.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;

@Service
@PropertySource("classpath:application.properties")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private DateDao dateDao;

    @Autowired
    private Environment environment;

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employee.setLogin(employee.getLogin().toLowerCase());
        employee.setDateOfEmployment(dateDao.getCurrentDate());

        employeeDao.addEmployee(employee);

        new File(environment.getProperty("user.files.directory") + "/" + employee.getLogin()).mkdirs();
    }

    @Override
    @Transactional
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    @Transactional
    public Employee getEmployeeById(Integer id) {
        return employeeDao.getEmployeeById(id);
    }

    @Override
    @Transactional
    public Employee getEmployeeByLogin(String login) {
        return employeeDao.getEmployeeByLogin(login.toLowerCase());
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
