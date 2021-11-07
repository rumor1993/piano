package com.sobrothers.piano.domain.student.repository;

import com.sobrothers.piano.domain.student.domain.Student;

import java.util.List;

public interface StudentRepositoryCustom {
    public Student save(Student student);

    public Student findMapStudentById(Long id);

    public List<Student> findMapAll();
}
