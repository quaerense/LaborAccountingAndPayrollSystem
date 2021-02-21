package org.quaerense.laps.dao;

import org.quaerense.laps.domain.StructuralSubdivision;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class StructuralSubdivisionDaoJpa implements StructuralSubdivisionDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addStructuralSubdivision(StructuralSubdivision structuralSubdivision) {
        entityManager.persist(structuralSubdivision);
    }

    @Override
    public List<StructuralSubdivision> getStructuralSubdivisions() {
        return entityManager.createQuery("SELECT ss FROM StructuralSubdivision ss", StructuralSubdivision.class)
                .getResultList();
    }

    @Override
    public StructuralSubdivision getStructuralSubdivisionById(Long id) {
        return entityManager.createQuery("SELECT ss FROM StructuralSubdivision ss WHERE ss.id = :id", StructuralSubdivision.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void updateStructuralSubdivision(StructuralSubdivision structuralSubdivision) {
        entityManager.merge(structuralSubdivision);
    }

    @Override
    public void deleteProfession(StructuralSubdivision structuralSubdivision) {
        entityManager.remove(structuralSubdivision);
    }
}
