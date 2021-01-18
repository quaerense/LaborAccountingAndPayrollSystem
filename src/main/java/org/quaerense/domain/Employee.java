package org.quaerense.domain;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "login", nullable = false)
    private String login;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "date_of_birth", nullable = false)
    private Date dateOfBirth;

    @Column(name = "salary", nullable = false, precision = 10, scale = 2)
    @Positive
    private BigDecimal salary;

    @Column(name = "rating", precision = 2, scale = 1)
    @DecimalMin(value = "1.0")
    @DecimalMax(value = "5.0")
    private BigDecimal rating;

    @OneToMany(mappedBy = "issuedBy", fetch = FetchType.EAGER)
    private Set<Task> issuedTask;

    @OneToMany(mappedBy = "performedBy", fetch = FetchType.EAGER)
    private Set<Task> performedTask;

    @ManyToMany
    @JoinTable(name = "employee_role",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public Employee() {
    }

    public Employee(String login, String password, String firstName, String lastName, String patronymic, Date dateOfBirth, @Positive BigDecimal salary, @DecimalMin(value = "1.0") @DecimalMax(value = "5.0") BigDecimal rating, Set<Task> issuedTask, Set<Task> performedTask, Set<Role> roles) {
        this.login = login;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.salary = salary;
        this.rating = rating;
        this.issuedTask = issuedTask;
        this.performedTask = performedTask;
        this.roles = roles;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getRating() {
        return rating;
    }

    public void setRating(BigDecimal rating) {
        this.rating = rating;
    }

    public Set<Task> getIssuedTask() {
        return issuedTask;
    }

    public void setIssuedTask(Set<Task> issuedTask) {
        this.issuedTask = issuedTask;
    }

    public Set<Task> getPerformedTask() {
        return performedTask;
    }

    public void setPerformedTask(Set<Task> performedTask) {
        this.performedTask = performedTask;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }
}
