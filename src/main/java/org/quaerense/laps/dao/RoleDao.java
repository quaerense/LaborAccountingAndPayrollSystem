package org.quaerense.laps.dao;

import org.quaerense.laps.domain.Role;

import java.util.List;

public interface RoleDao {
    void addRole(Role role);

    List<Role> getRoles();

    void updateRole(Role role);

    void deleteRole(Role role);
}
