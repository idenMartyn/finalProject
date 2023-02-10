package components.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomePageStudentController {
    @GetMapping("/student/{id}")
    public String student(@PathVariable("id") int id, Model model){
        //Получим студента из DAO по id и передадим в представление
        return "users/student/HomePageStudent";
    }
}
