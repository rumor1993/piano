package com.sobrothers.piano.domain.student.repository;

import com.sobrothers.piano.domain.student.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>, StudentRepositoryCustom {

}
