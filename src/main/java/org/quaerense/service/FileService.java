package org.quaerense.service;

import org.quaerense.domain.UserFile;

import java.util.List;

public interface FileService {
    void addFile(UserFile userFile);

    List<UserFile> getFilesByTaskId(Long id);
}
