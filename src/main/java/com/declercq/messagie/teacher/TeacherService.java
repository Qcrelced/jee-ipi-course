package com.declercq.messagie.teacher;

import com.declercq.messagie.message.Message;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherService {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher sauvegarderTeacher() {
        Teacher teacher = new Teacher();
        List<Teacher> teachers = teacherRepository.findByName("toto");
        teacher = teachers.get(0);
        teacher.setName("tata");
        return teacherRepository.save(teacher);
    }



}
