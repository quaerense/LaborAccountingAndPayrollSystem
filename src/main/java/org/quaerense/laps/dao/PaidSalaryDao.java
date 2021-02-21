package org.quaerense.laps.dao;

import org.quaerense.laps.domain.PaidSalary;

import java.util.List;

public interface PaidSalaryDao {
    void addPaidSalary(PaidSalary paidSalary);

    List<PaidSalary> getPaidSalariesByEmployeeId(Long id);
}
