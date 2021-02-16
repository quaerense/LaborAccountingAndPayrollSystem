package org.quaerense.laps.domain;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "profession")
public class Profession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "profession", fetch = FetchType.EAGER)
    private Set<Employee> employees;

    @ManyToMany(mappedBy = "profession")
    private Set<Role> roles;

    public Profession() {
    }

    public Profession(Long id, String name, Set<Employee> employees, Set<Role> roles) {
        this.id = id;
        this.name = name;
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

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
