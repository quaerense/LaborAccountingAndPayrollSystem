package org.quaerense.service;

import org.quaerense.dao.FileDao;
import org.quaerense.domain.UserFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileDao fileDao;

    @Override
    @Transactional
    public void addFile(UserFile userFile) {
        fileDao.addFile(userFile);
    }

    @Override
    @Transactional
    public List<UserFile> getFilesByTaskId(Long id) {
        return fileDao.getFilesByTaskId(id);
    }
}
