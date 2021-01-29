package org.quaerense.dao;

import org.quaerense.domain.File;

import java.util.List;

public interface FileDao {
    void addFile(File file);

    List<File> getFilesByTaskId(Long id);
}
