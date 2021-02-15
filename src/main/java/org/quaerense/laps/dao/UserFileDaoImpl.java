package org.quaerense.laps.dao;

import org.quaerense.laps.domain.UserFile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserFileDaoImpl implements UserFileDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addUserFile(UserFile userFile) {
        entityManager.persist(userFile);
    }

    @Override
    public List<UserFile> getUserFilesByTaskId(Long id) {
        return entityManager.createQuery("SELECT f FROM UserFile f WHERE f.task.id = :taskId", UserFile.class)
                .setParameter("taskId", id)
                .getResultList();
    }
}
