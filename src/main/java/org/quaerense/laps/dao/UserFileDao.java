package org.quaerense.laps.dao;

import org.quaerense.laps.domain.UserFile;

import java.util.List;

public interface UserFileDao {
    void addUserFile(UserFile userFile);

    List<UserFile> getUserFilesByTaskId(Long id);
}
