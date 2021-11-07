package com.sobrothers.piano.domain.student.service;

import com.sobrothers.piano.domain.student.domain.Student;
import com.sobrothers.piano.domain.student.repository.StudentRepository;
import com.sobrothers.piano.domain.student.repository.StudentRepositoryCustom;
import com.sobrothers.piano.domain.student.repository.StudentRepositoryCustomImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;

@SpringBootTest
class StudentServiceTest {

    @BeforeEach
    public void beforeEach() {
    }

    @Test
    public void 모든_수강생_조회() {

    }

}