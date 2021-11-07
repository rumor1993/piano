package com.sobrothers.piano.domain.student.service;

import com.sobrothers.piano.domain.student.domain.Student;
import com.sobrothers.piano.domain.student.repository.StudentRepository;
import com.sobrothers.piano.domain.student.repository.StudentRepositoryCustom;
import com.sobrothers.piano.domain.student.repository.StudentRepositoryCustomImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentRepository studentRepository;

    @BeforeEach
    public void beforeEach() {

    }

    @Test
    public void ID로_수강생_조회() {
        //given
        Student student1 = new Student();
        student1.setName("소문혁");
        studentRepository.save(student1);

        // when
        Student student = studentRepository.findById(1L)
                .orElse(null);

        // then
        Assertions.assertThat(student.getId()).isEqualTo(1);

    }

    @Test
    public void 모든_수강생_조회() {
        //given
        Student student1 = new Student();
        student1.setName("소문혁");
        Student student2 = new Student();
        student2.setName("소준혁");
        studentRepository.save(student1);
        studentRepository.save(student2);

        //when
        List<Student> students = studentRepository.findAll();

        //then
        Assertions.assertThat(students.size()).isEqualTo(2);
    }
}