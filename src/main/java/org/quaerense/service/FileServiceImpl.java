package org.quaerense.service;

import org.quaerense.dao.FileDao;
import org.quaerense.domain.File;
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
    public void addFile(File file) {
        fileDao.addFile(file);
    }

    @Override
    @Transactional
    public List<File> getFilesByTaskId(Long id) {
        return fileDao.getFilesByTaskId(id);
    }
}
