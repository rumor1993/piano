package com.sobrothers.piano.domain.student.web;

import com.sobrothers.piano.domain.student.domain.Student;
import com.sobrothers.piano.domain.student.repository.StudentRepository;
import com.sobrothers.piano.domain.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor //생성자 주입
@RestController
public class StudentController {

    private StudentService studentService;
    private StudentRepository studentRepository;
    // 주석
    // GET + 도메인 (Entity)
    @GetMapping("/students")
    public List<Student> getStudents()  {
        List<Student> students = studentService.getStudents();
        return students;
    }

    // GET + 도메인 (Entity)
    @GetMapping("/students/{name}")
    public List<Student> getStudents(@PathVariable String name)  {
        List<Student> students = studentRepository.findByNames(name);
        return students;
    }
}
