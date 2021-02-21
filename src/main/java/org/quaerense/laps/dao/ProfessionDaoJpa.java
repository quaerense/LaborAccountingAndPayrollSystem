package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Profession;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProfessionDaoJpa implements ProfessionDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addProfession(Profession profession) {
        entityManager.persist(profession);
    }

    @Override
    public List<Profession> getProfessions() {
        return entityManager.createQuery("SELECT p FROM Profession p", Profession.class)
                .getResultList();
    }

    @Override
    public Profession getProfessionById(Long id) {
        return entityManager.createQuery("SELECT p FROM Profession p WHERE p.id = :id", Profession.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void updateProfession(Profession profession) {
        entityManager.merge(profession);
    }

    @Override
    public void deleteProfession(Profession profession) {
        entityManager.remove(profession);
    }
}
