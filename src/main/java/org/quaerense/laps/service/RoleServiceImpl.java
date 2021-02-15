package org.quaerense.laps.service;

import org.quaerense.laps.dao.RoleDao;
import org.quaerense.laps.domain.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;

    @Override
    @Transactional
    public void addRole(Role role) {
        roleDao.addRole(role);
    }

    @Override
    @Transactional
    public List<Role> getRoles() {
        return roleDao.getRoles();
    }

    @Override
    @Transactional
    public void updateRole(Role role) {
        roleDao.updateRole(role);
    }

    @Override
    @Transactional
    public void deleteRole(Role role) {
        roleDao.deleteRole(role);
    }
}
