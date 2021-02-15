package org.quaerense.laps.service;

import org.quaerense.laps.domain.PaidSalary;

import java.util.List;

public interface PaidSalaryService {
    void addPaidSalary(PaidSalary paidSalary);

    List<PaidSalary> getPaidSalariesByEmployeeId(Integer id);
}
