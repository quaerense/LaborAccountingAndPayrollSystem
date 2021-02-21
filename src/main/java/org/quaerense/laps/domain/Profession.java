package org.quaerense.laps.domain;

import javax.persistence.*;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "professions")
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Positive
    @Column(name = "salary", nullable = false, precision = 10, scale = 2)
    private BigDecimal salary;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "structural_subdivision_id")
    private StructuralSubdivision structuralSubdivision;

    @OneToMany(mappedBy = "profession")
    private List<Employee> employees;

    @ManyToMany(mappedBy = "professions")
    private List<Role> roles;

    public Profession() {
    }

    public Profession(String name, @Positive BigDecimal salary, StructuralSubdivision structuralSubdivision, List<Employee> employees, List<Role> roles) {
        this.name = name;
        this.salary = salary;
        this.structuralSubdivision = structuralSubdivision;
        this.employees = employees;
        this.roles = roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public StructuralSubdivision getStructuralSubdivision() {
        return structuralSubdivision;
    }

    public void setStructuralSubdivision(StructuralSubdivision structuralSubdivision) {
        this.structuralSubdivision = structuralSubdivision;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}
