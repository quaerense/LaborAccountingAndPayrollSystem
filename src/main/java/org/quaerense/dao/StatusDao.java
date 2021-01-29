package org.quaerense.dao;

import org.quaerense.domain.Status;

import java.util.List;

public interface StatusDao {
    void addStatus(Status status);

    List<Status> getStatuses();

    void updateStatus(Status status);

    void deleteStatus(Status status);
}
