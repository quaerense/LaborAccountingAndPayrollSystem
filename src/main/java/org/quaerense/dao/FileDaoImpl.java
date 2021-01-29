package org.quaerense.dao;

import org.quaerense.domain.File;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class FileDaoImpl implements FileDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void addFile(File file) {
        entityManager.persist(file);
    }

    @Override
    public List<File> getFilesByTaskId(Long id) {
        return entityManager.createQuery("SELECT f FROM File f WHERE f.task.id = :taskId", File.class)
                .setParameter("taskId", id)
                .getResultList();
    }
}
