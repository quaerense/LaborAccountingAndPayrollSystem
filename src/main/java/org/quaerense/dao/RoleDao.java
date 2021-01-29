package org.quaerense.dao;

import org.quaerense.domain.Role;

import java.util.List;

public interface RoleDao {
    void addRole(Role role);

    List<Role> getRoles();

    Role getRoleById(Integer id);

    void updateRole(Role role);

    void deleteRole(Role role);
}
