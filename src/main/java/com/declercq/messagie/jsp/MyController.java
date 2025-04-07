package com.declercq.messagie.jsp;

import com.declercq.messagie.student.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MyController {

    //http://localhost:8080/hello
    @GetMapping("/hello")
    public String testHello(Model model){
        System.out.println("/hello");

        ArrayList<Student> liststudent = new ArrayList<>();
        liststudent.add(new Student("Toto", 12));
        liststudent.add(new Student("Tata", 14));
        model.addAttribute("students", liststudent);

        //Nom du fichier HTML que l'on souhaite afficher
        model.addAttribute("bonjour", "bonjour");
        model.addAttribute("student", new Student("Jimmy", 12));


        return "welcome";
    }

}