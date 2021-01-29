package org.quaerense.dao;

import org.quaerense.domain.PaidSalary;

import java.util.List;

public interface PaidSalaryDao {
    void addPaidSalary(PaidSalary paidSalary);

    List<PaidSalary> getAllPaidSalariesByEmployeeId(Integer id);
}
