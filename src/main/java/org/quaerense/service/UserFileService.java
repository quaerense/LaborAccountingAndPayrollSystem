package org.quaerense.service;

import org.quaerense.domain.UserFile;

import java.util.List;

public interface UserFileService {
    void addUserFile(UserFile userFile);

    List<UserFile> getUserFilesByTaskId(Long id);
}
