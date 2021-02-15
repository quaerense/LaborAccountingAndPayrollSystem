package org.quaerense.laps.service;

import org.quaerense.laps.domain.Role;

import java.util.List;

public interface RoleService {
    void addRole(Role role);

    List<Role> getRoles();

    void updateRole(Role role);

    void deleteRole(Role role);
}
