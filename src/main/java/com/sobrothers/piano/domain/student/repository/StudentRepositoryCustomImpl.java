package com.sobrothers.piano.domain.student.repository;

import com.sobrothers.piano.domain.student.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryCustomImpl implements StudentRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Student> findByNames(String name) {
        return entityManager.createQuery("select s from Student s where s.name = :name")
                .setParameter("name", name)
                .getResultList();
    }
}
