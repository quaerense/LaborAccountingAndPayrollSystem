package org.quaerense.laps.service;

import org.quaerense.laps.domain.Day;

import java.sql.Date;
import java.util.List;

public interface DayService {
    void endTheDay(Day day);

    List<Day> getDaysByEmployeeId(Long id);

    Day getDayById(Long id);

    Date getDayByDate(Date date);
}
