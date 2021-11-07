package com.sobrothers.piano.domain.student.web;

import com.sobrothers.piano.domain.student.domain.Student;
import com.sobrothers.piano.domain.student.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RequiredArgsConstructor //생성자 주입
@RestController
public class StudentController {

    private StudentService studentService;

    @GetMapping("/students")
    public Student test() throws Exception{
        Student student = new Student();
        student.setName("소준혁");



        return student;
    }


}
