package org.quaerense.laps.service;

import org.quaerense.laps.dao.DayDao;
import org.quaerense.laps.domain.Day;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.List;

@Service
public class DayServiceImpl implements DayService {
    @Autowired
    private DayDao dayDao;

    @Override
    @Transactional
    public void endTheDay(Day day) {
        dayDao.addDay(day);
    }

    @Override
    @Transactional
    public List<Day> getDaysByEmployeeId(Long id) {
        return dayDao.getDaysByEmployeeId(id);
    }

    @Override
    @Transactional
    public Day getDayById(Long id) {
        return dayDao.getDayById(id);
    }

    @Override
    @Transactional
    public Date getDayByDate(Date date) {
        return dayDao.getDayByDate(date);
    }
}
