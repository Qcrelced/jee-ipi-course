package com.declercq.messagie.teacher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @GetMapping("/teacherRegister")
    public void teacherRegister() {
        teacherService.sauvegarderTeacher();
    }
}
