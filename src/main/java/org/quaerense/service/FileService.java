package org.quaerense.service;

import org.quaerense.domain.File;

import java.util.List;

public interface FileService {
    void addFile(File file);

    List<File> getFilesByTaskId(Long id);
}
