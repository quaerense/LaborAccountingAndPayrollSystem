package org.quaerense.dao;

import org.quaerense.domain.UserFile;

import java.util.List;

public interface UserFileDao {
    void addUserFile(UserFile userFile);

    List<UserFile> getUserFilesByTaskId(Long id);
}
