package org.quaerense.laps.dao;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.sql.Date;
import java.sql.Timestamp;

@Repository
public class DateDaoMysql implements DateDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Date getCurrentDate() {
        return (Date) entityManager.createNativeQuery("SELECT CURRENT_DATE").getSingleResult();
    }

    @Override
    public Timestamp getCurrentTimestamp() {
        return (Timestamp) entityManager.createNativeQuery("SELECT CURRENT_TIMESTAMP()").getSingleResult();
    }
}
