package kz.bitlab.springboot.sprint.controller;

import kz.bitlab.springboot.sprint.db.Music;
import kz.bitlab.springboot.sprint.db.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String indexPage(Model model){
        ArrayList<Student> studentArray = DBManager.getStudents();
        model.addAttribute("studentter", studentArray);
        return "index";
    }

    @GetMapping(value = "/add-student-page")
    public String studentPage(){
        return "add-student-page";
    }

    @PostMapping(value = "/add-student")
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/";
    }
}
