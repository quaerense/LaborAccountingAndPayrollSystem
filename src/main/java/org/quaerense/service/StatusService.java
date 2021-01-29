package org.quaerense.service;

import org.quaerense.domain.Status;

import java.util.List;

public interface StatusService {
    void addStatus(Status status);

    List<Status> getStatuses();

    void updateStatus(Status status);

    void deleteStatus(Status status);
}
