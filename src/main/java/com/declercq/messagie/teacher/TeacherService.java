package com.declercq.messagie.teacher;

import org.springframework.stereotype.Service;

@Service
public class TeacherService {


    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public void sauvegarderTeacher() {

    }



}
