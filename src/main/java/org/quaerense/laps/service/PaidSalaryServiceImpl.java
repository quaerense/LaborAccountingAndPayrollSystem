package org.quaerense.laps.service;

import org.quaerense.laps.dao.DateDao;
import org.quaerense.laps.dao.PaidSalaryDao;
import org.quaerense.laps.domain.PaidSalary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PaidSalaryServiceImpl implements PaidSalaryService {
    @Autowired
    private PaidSalaryDao paidSalaryDao;

    @Autowired
    private DateDao dateDao;

    @Override
    @Transactional
    public void addPaidSalary(PaidSalary paidSalary) {
        paidSalary.setAccruedOn(dateDao.getCurrentTimestamp());

        paidSalaryDao.addPaidSalary(paidSalary);
    }

    @Override
    @Transactional
    public List<PaidSalary> getPaidSalariesByEmployeeId(Long id) {
        return paidSalaryDao.getPaidSalariesByEmployeeId(id);
    }
}
