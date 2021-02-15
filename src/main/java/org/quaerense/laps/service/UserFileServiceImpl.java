package org.quaerense.laps.service;

import org.quaerense.laps.dao.UserFileDao;
import org.quaerense.laps.domain.UserFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserFileServiceImpl implements UserFileService {
    @Autowired
    private UserFileDao userFileDao;

    @Override
    @Transactional
    public void addUserFile(UserFile userFile) {
        userFileDao.addUserFile(userFile);
    }

    @Override
    @Transactional
    public List<UserFile> getUserFilesByTaskId(Long id) {
        return userFileDao.getUserFilesByTaskId(id);
    }
}
