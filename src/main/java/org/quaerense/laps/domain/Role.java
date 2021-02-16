package org.quaerense.laps.domain;

import javax.persistence.*;
import java.util.Set;

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
    private Set<Profession> profession;

    public Role() {
    }

    public Role(Long id, String name, Set<Profession> profession) {
        this.id = id;
        this.name = name;
        this.profession = profession;
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

    public Set<Profession> getProfession() {
        return profession;
    }

    public void setProfession(Set<Profession> profession) {
        this.profession = profession;
    }
}
