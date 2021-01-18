package org.quaerense.domain;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    @Type(type = "text")
    private String description;

    @Column(name = "complete_before", nullable = false)
    private Timestamp completeBefore;

    @Column(name = "evaluation", precision = 2, scale = 1)
    @DecimalMin(value = "1.0")
    @DecimalMax(value = "5.0")
    private BigDecimal evaluation;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "issued_by_id")
    private Employee issuedBy;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "performed_by_id")
    private Employee performedBy;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "status_id")
    private Status status;

    @OneToMany(mappedBy = "task", fetch = FetchType.EAGER)
    private Set<File> files;

    public Task() {
    }

    public Task(String name, String description, Timestamp completeBefore, @DecimalMin(value = "1.0") @DecimalMax(value = "5.0") BigDecimal evaluation, Employee issuedBy, Employee performedBy, Status status, Set<File> files) {
        this.name = name;
        this.description = description;
        this.completeBefore = completeBefore;
        this.evaluation = evaluation;
        this.issuedBy = issuedBy;
        this.performedBy = performedBy;
        this.status = status;
        this.files = files;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCompleteBefore() {
        return completeBefore;
    }

    public void setCompleteBefore(Timestamp completeBefore) {
        this.completeBefore = completeBefore;
    }

    public BigDecimal getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(BigDecimal evaluation) {
        this.evaluation = evaluation;
    }

    public Employee getIssuedBy() {
        return issuedBy;
    }

    public void setIssuedBy(Employee issuedBy) {
        this.issuedBy = issuedBy;
    }

    public Employee getPerformedBy() {
        return performedBy;
    }

    public void setPerformedBy(Employee performedBy) {
        this.performedBy = performedBy;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Set<File> getFiles() {
        return files;
    }

    public void setFiles(Set<File> files) {
        this.files = files;
    }
}
