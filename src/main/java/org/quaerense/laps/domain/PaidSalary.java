package org.quaerense.laps.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "paid_salaries")
public class PaidSalary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "accrued_on")
    private Timestamp accruedOn;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee;

    public PaidSalary() {
    }

    public PaidSalary(Timestamp accruedOn, Employee employee) {
        this.accruedOn = accruedOn;
        this.employee = employee;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Timestamp getAccruedOn() {
        return accruedOn;
    }

    public void setAccruedOn(Timestamp accruedOn) {
        this.accruedOn = accruedOn;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
}
