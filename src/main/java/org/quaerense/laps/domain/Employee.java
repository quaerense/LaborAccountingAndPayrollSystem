package org.quaerense.laps.domain;

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

    @Size(min = 4, max = 16, message = "Username should be between 4 and 16 characters")
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Size(min = 8, message = "Password must be over 8 characters")
    @Column(name = "password", nullable = false)
    private String password;

    @Transient
    private String confirmPassword;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Email
    @Column(name = "email", unique = true, length = 128)
    private String email;

    @Column(name = "phone_number", unique = true, length = 32)
    private String phoneNumber;

    @Column(name = "account_number")
    private String accountNumber;

    @Positive
    @Column(name = "salary", nullable = false, precision = 10, scale = 2)
    private BigDecimal salary;

    @DecimalMin(value = "1.0")
    @DecimalMax(value = "5.0")
    @Column(name = "rating", precision = 2, scale = 1)
    private BigDecimal rating;

    @Column(name = "date_of_employment", nullable = false)
    private Date dateOfEmployment;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    private Set<EmployeeStatus> employeeStatuses;

    @OneToMany(mappedBy = "issuedBy", fetch = FetchType.EAGER)
    private Set<Task> issuedTasks;

    @OneToMany(mappedBy = "performedBy", fetch = FetchType.EAGER)
    private Set<Task> performedTasks;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    private Set<PaidSalary> paidSalaries;

    @OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
    private Set<WorkedDay> workedDays;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "department_id")
    private Department department;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profession_id")
    private Profession profession;

    public Employee() {
    }

    public Employee(Integer id, @Size(min = 4, max = 16, message = "Username should be between 4 and 16 characters") String username, @Size(min = 8, message = "Password must be over 8 characters") String password, String confirmPassword, String firstName, String lastName, String patronymic, Date dateOfBirth, @Email String email, String phoneNumber, String accountNumber, @Positive BigDecimal salary, @DecimalMin(value = "1.0") @DecimalMax(value = "5.0") BigDecimal rating, Date dateOfEmployment, Set<EmployeeStatus> employeeStatuses, Set<Task> issuedTasks, Set<Task> performedTasks, Set<PaidSalary> paidSalaries, Set<WorkedDay> workedDays, Department department, Profession profession) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.salary = salary;
        this.rating = rating;
        this.dateOfEmployment = dateOfEmployment;
        this.employeeStatuses = employeeStatuses;
        this.issuedTasks = issuedTasks;
        this.performedTasks = performedTasks;
        this.paidSalaries = paidSalaries;
        this.workedDays = workedDays;
        this.department = department;
        this.profession = profession;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
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

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Set<EmployeeStatus> getEmployeeStatuses() {
        return employeeStatuses;
    }

    public void setEmployeeStatuses(Set<EmployeeStatus> employeeStatuses) {
        this.employeeStatuses = employeeStatuses;
    }

    public Set<Task> getIssuedTasks() {
        return issuedTasks;
    }

    public void setIssuedTasks(Set<Task> issuedTasks) {
        this.issuedTasks = issuedTasks;
    }

    public Set<Task> getPerformedTasks() {
        return performedTasks;
    }

    public void setPerformedTasks(Set<Task> performedTasks) {
        this.performedTasks = performedTasks;
    }

    public Set<PaidSalary> getPaidSalaries() {
        return paidSalaries;
    }

    public void setPaidSalaries(Set<PaidSalary> paidSalaries) {
        this.paidSalaries = paidSalaries;
    }

    public Set<WorkedDay> getWorkedDays() {
        return workedDays;
    }

    public void setWorkedDays(Set<WorkedDay> workedDays) {
        this.workedDays = workedDays;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }
}