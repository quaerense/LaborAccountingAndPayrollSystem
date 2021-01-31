package org.quaerense.service;

import org.quaerense.dao.EmployeeDao;
import org.quaerense.domain.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.util.List;

@Service
@PropertySource("classpath:config.properties")
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private Environment environment;

    @Override
    @Transactional
    public void addEmployee(Employee employee) {
        employeeDao.addEmployee(employee);

        new File(environment.getProperty("user.files") + "/" + employee.getLogin()).mkdirs();
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
    public void updateEmployee(Employee employee) {
        employeeDao.updateEmployee(employee);
    }

    @Override
    @Transactional
    public void deleteEmployee(Employee employee) {
        employeeDao.deleteEmployee(employee);
    }
}
