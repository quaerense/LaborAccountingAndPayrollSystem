package org.quaerense.service;

import org.quaerense.domain.PaidSalary;

import java.util.List;

public interface PaidSalaryService {
    void addPaidSalary(PaidSalary paidSalary);

    List<PaidSalary> getPaidSalariesByEmployeeId(Integer id);
}
