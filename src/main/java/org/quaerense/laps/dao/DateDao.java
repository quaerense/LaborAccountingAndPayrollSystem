package org.quaerense.laps.dao;

import java.sql.Date;
import java.sql.Timestamp;

public interface DateDao {
    Date getCurrentDate();

    Timestamp getCurrentTimestamp();

    Integer getDayOfWeekByDate(Date date);
}
