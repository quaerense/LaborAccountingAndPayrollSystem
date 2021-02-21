package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Day;

import java.sql.Date;
import java.util.List;

public interface DayDao {
    void addDay(Day day);

    List<Day> getDaysByEmployeeId(Long id);

    Day getDayById(Long id);

    Date getDayByDate(Date date);
}
