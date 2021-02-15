package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Status;

import java.util.List;

public interface StatusDao {
    void addStatus(Status status);

    List<Status> getStatuses();

    void updateStatus(Status status);

    void deleteStatus(Status status);
}
