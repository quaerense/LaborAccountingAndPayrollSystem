package org.quaerense.laps.service;

import org.quaerense.laps.dao.StructuralSubdivisionDao;
import org.quaerense.laps.domain.StructuralSubdivision;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StructuralSubdivisionServiceImpl implements StructuralSubdivisionService {
    @Autowired
    private StructuralSubdivisionDao structuralSubdivisionDao;

    @Override
    @Transactional
    public void addStructuralSubdivision(StructuralSubdivision structuralSubdivision) {
        structuralSubdivisionDao.addStructuralSubdivision(structuralSubdivision);
    }

    @Override
    @Transactional
    public List<StructuralSubdivision> getStructuralSubdivisions() {
        return structuralSubdivisionDao.getStructuralSubdivisions();
    }

    @Override
    @Transactional
    public StructuralSubdivision getStructuralSubdivisionById(Long id) {
        return structuralSubdivisionDao.getStructuralSubdivisionById(id);
    }

    @Override
    @Transactional
    public void updateStructuralSubdivision(StructuralSubdivision structuralSubdivision) {
        structuralSubdivisionDao.updateStructuralSubdivision(structuralSubdivision);
    }

    @Override
    @Transactional
    public void deleteProfession(StructuralSubdivision structuralSubdivision) {
        structuralSubdivisionDao.deleteProfession(structuralSubdivision);
    }
}
