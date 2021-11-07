package com.sobrothers.piano.domain.student.service;

import com.sobrothers.piano.domain.student.domain.Student;
import com.sobrothers.piano.domain.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    /**
     * 전체학생정보
     * @return
     */
    public List<Student> getStudents() {
        return studentRepository.findAll();
    }
    /**
     * 특정학생조회 (ID)
     * @return
     */
    public Student getStudent(Long id) {
        return studentRepository.findById(id)
                .orElse(null);
    }
}
