package org.quaerense.laps.service;

import org.quaerense.laps.domain.UserFile;

import java.util.List;

public interface UserFileService {
    void addUserFile(UserFile userFile);

    List<UserFile> getUserFilesByTaskId(Long id);
}
