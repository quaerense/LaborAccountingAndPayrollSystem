package org.quaerense.laps.service;

import org.quaerense.laps.domain.StructuralSubdivision;

import java.util.List;

public interface StructuralSubdivisionService {
    void addStructuralSubdivision(StructuralSubdivision structuralSubdivision);

    List<StructuralSubdivision> getStructuralSubdivisions();

    StructuralSubdivision getStructuralSubdivisionById(Long id);

    void updateStructuralSubdivision(StructuralSubdivision structuralSubdivision);

    void deleteProfession(StructuralSubdivision structuralSubdivision);
}
