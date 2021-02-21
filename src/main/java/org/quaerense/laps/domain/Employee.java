package org.quaerense.laps.domain;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(min = 4, max = 16, message = "Имя пользователя должно содержать от 4 до 16 символов")
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Size(min = 8, message = "Пароль должен состоять минимум из 8 символов")
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

    @Column(name = "personnel_number")
    private String personnelNumber;

    @Email
    @Column(name = "email", unique = true, length = 128)
    private String email;

    @Column(name = "phone_number", unique = true, length = 32)
    private String phoneNumber;

    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "date_of_employment", nullable = false)
    private Date dateOfEmployment;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profession_id")
    private Profession profession;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeStatus> employeeStatuses;

    @OneToMany(mappedBy = "employee")
    private List<PaidSalary> paidSalaries;

    @ManyToMany
    @JoinTable(name = "employee_day",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "day_id"))
    private List<Day> days;

    public Employee() {
    }

    public Employee(Long id, @Size(min = 4, max = 16, message = "Имя пользователя должно содержать от 4 до 16 символов") String username, @Size(min = 8, message = "Пароль должен состоять минимум из 8 символов") String password, String confirmPassword, String firstName, String lastName, String patronymic, Date dateOfBirth, String personnelNumber, @Email String email, String phoneNumber, String accountNumber, Date dateOfEmployment, Profession profession, List<EmployeeStatus> employeeStatuses, List<PaidSalary> paidSalaries, List<Day> days) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.personnelNumber = personnelNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.dateOfEmployment = dateOfEmployment;
        this.profession = profession;
        this.employeeStatuses = employeeStatuses;
        this.paidSalaries = paidSalaries;
        this.days = days;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getPersonnelNumber() {
        return personnelNumber;
    }

    public void setPersonnelNumber(String personnelNumber) {
        this.personnelNumber = personnelNumber;
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

    public Date getDateOfEmployment() {
        return dateOfEmployment;
    }

    public void setDateOfEmployment(Date dateOfEmployment) {
        this.dateOfEmployment = dateOfEmployment;
    }

    public Profession getProfession() {
        return profession;
    }

    public void setProfession(Profession profession) {
        this.profession = profession;
    }

    public List<EmployeeStatus> getEmployeeStatuses() {
        return employeeStatuses;
    }

    public void setEmployeeStatuses(List<EmployeeStatus> employeeStatuses) {
        this.employeeStatuses = employeeStatuses;
    }

    public List<PaidSalary> getPaidSalaries() {
        return paidSalaries;
    }

    public void setPaidSalaries(List<PaidSalary> paidSalaries) {
        this.paidSalaries = paidSalaries;
    }

    public List<Day> getDays() {
        return days;
    }

    public void setDays(List<Day> days) {
        this.days = days;
    }
}