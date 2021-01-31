package org.quaerense.dao;

import org.quaerense.domain.UserFile;

import java.util.List;

public interface FileDao {
    void addFile(UserFile userFile);

    List<UserFile> getFilesByTaskId(Long id);
}
