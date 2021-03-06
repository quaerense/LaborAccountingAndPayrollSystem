package org.quaerense.laps.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name", unique = true, length = 32)
    private String name;

    @ManyToMany
    @JoinTable(name = "profession_role",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "profession_id"))
    private List<Profession> professions;

    public Role() {
    }

    public Role(String name, List<Profession> professions) {
        this.name = name;
        this.professions = professions;
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

    public List<Profession> getProfessions() {
        return professions;
    }

    public void setProfession(List<Profession> professions) {
        this.professions = professions;
    }
}
