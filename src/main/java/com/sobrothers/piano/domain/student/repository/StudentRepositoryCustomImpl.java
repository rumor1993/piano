package com.sobrothers.piano.domain.student.repository;

import com.sobrothers.piano.domain.student.domain.Student;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentRepositoryCustomImpl implements StudentRepositoryCustom {
    private static Map<Long, Student> store = new HashMap<>();
    private static Long sequence = 0L;


    @Override
    public Student save(Student student) {
        student.setId(sequence++);
        store.put(student.getId(), student);
        return student;
    }

    @Override
    public Student findMapStudentById(Long id) {
        Student student = store.get(id);
        return student;
    }

    @Override
    public List<Student> findMapAll() {
        Collection<Student> values = store.values();
        return (List<Student>) values;
    }
}
