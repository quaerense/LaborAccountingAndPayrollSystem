package org.quaerense.service;

import org.quaerense.dao.PaidSalaryDao;
import org.quaerense.domain.PaidSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaidSalaryServiceImpl implements PaidSalaryService {
    @Autowired
    private PaidSalaryDao paidSalaryDao;

    @Override
    @Transactional
    public void addPaidSalary(PaidSalary paidSalary) {
        paidSalaryDao.addPaidSalary(paidSalary);
    }

    @Override
    @Transactional
    public List<PaidSalary> getPaidSalariesByEmployeeId(Integer id) {
        return paidSalaryDao.getAllPaidSalariesByEmployeeId(id);
    }
}
