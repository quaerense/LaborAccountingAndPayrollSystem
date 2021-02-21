package org.quaerense.laps.dao;

import org.quaerense.laps.domain.StructuralSubdivision;

import java.util.List;

public interface StructuralSubdivisionDao {
    void addStructuralSubdivision(StructuralSubdivision structuralSubdivision);

    List<StructuralSubdivision> getStructuralSubdivisions();

    StructuralSubdivision getStructuralSubdivisionById(Long id);

    void updateStructuralSubdivision(StructuralSubdivision structuralSubdivision);

    void deleteProfession(StructuralSubdivision structuralSubdivision);
}
