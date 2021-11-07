package com.sobrothers.piano.domain.student.repository;

import com.sobrothers.piano.domain.student.domain.Student;

import java.util.List;

public interface StudentRepositoryCustom {
    public List<Student> findByNames(String name);
}
