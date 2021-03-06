package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Profession;

import java.util.List;

public interface ProfessionDao {
    void addProfession(Profession profession);

    List<Profession> getProfessions();

    Profession getProfessionById(Long id);

    void updateProfession(Profession profession);

    void deleteProfession(Profession profession);
}
