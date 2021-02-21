package org.quaerense.laps.service;

import org.quaerense.laps.dao.ProfessionDao;
import org.quaerense.laps.domain.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    private ProfessionDao professionDao;

    @Override
    @Transactional
    public void addProfession(Profession profession) {
        professionDao.addProfession(profession);
    }

    @Override
    @Transactional
    public List<Profession> getProfessions() {
        return professionDao.getProfessions();
    }

    @Override
    @Transactional
    public Profession getProfessionById(Long id) {
        return professionDao.getProfessionById(id);
    }

    @Override
    @Transactional
    public void updateProfession(Profession profession) {
        professionDao.updateProfession(profession);
    }

    @Override
    @Transactional
    public void deleteProfession(Profession profession) {
        professionDao.deleteProfession(profession);
    }
}
