package org.quaerense.laps.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "structural_subdivisions")
public class StructuralSubdivision {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "structuralSubdivision")
    private List<Profession> professions;

    public StructuralSubdivision() {
    }

    public StructuralSubdivision(String code, String name, List<Profession> professions) {
        this.code = code;
        this.name = name;
        this.professions = professions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Profession> getProfessions() {
        return professions;
    }

    public void setProfessions(List<Profession> professions) {
        this.professions = professions;
    }
}
