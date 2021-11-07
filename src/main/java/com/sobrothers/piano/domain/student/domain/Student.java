package com.sobrothers.piano.domain.student.domain;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
//@Builder
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private String email;
    @NotNull
    private String password;
    @NotNull
    private Long phone;
    @NotNull
    private LocalDateTime birthday;
    private String address;
    private String branchOffice;
    private String job;
    // 방문경로
    private String funnel;
    private String studentNotes;
    private String lessonNotes;
    private boolean pushStatus;
}
