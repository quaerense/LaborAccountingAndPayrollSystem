package org.quaerense.dao;

import org.quaerense.domain.UserFile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class FileDaoImpl implements FileDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addFile(UserFile userFile) {
        entityManager.persist(userFile);
    }

    @Override
    public List<UserFile> getFilesByTaskId(Long id) {
        return entityManager.createQuery("SELECT f FROM UserFile f WHERE f.task.id = :taskId", UserFile.class)
                .setParameter("taskId", id)
                .getResultList();
    }
}
