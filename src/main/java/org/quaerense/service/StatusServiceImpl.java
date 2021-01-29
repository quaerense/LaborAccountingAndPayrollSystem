package org.quaerense.service;

import org.quaerense.dao.StatusDao;
import org.quaerense.domain.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StatusServiceImpl implements StatusService {
    @Autowired
    private StatusDao statusDao;

    @Override
    @Transactional
    public void addStatus(Status status) {
        statusDao.addStatus(status);
    }

    @Override
    @Transactional
    public List<Status> getStatuses() {
        return statusDao.getStatuses();
    }

    @Override
    @Transactional
    public void updateStatus(Status status) {
        statusDao.updateStatus(status);
    }

    @Override
    @Transactional
    public void deleteStatus(Status status) {
        statusDao.deleteStatus(status);
    }
}
