package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Day;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Date;
import java.util.List;

@Repository
public class DayDaoJpa implements DayDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addDay(Day day) {
        entityManager.persist(day);
    }

    @Override
    public List<Day> getDaysByEmployeeId(Long id) {
        return entityManager.createQuery("SELECT d FROM Day d JOIN Employee e WHERE e.id = :id", Day.class)
                .setParameter("id", id)
                .getResultList();
    }

    @Override
    public Day getDayById(Long id) {
        return entityManager.find(Day.class, id);
    }

    @Override
    public Date getDayByDate(Date date) {
        return entityManager.createQuery("SELECT d FROM Day d WHERE d.date = :date", Date.class)
                .setParameter("date", date)
                .getSingleResult();
    }
}
