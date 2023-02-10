package components.controllers;

import components.dao.PersonDAO;
import components.dao.TeacherDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomePageTeacherController {

    private final PersonDAO personDAO;

    @Autowired
    public HomePageTeacherController(PersonDAO personDAO){
        this.personDAO = personDAO;
    }

    @GetMapping("/teacher/{id}")
    public String show(@PathVariable("id") int id, Model model){
        //Получим учителя из DAO по id и передадим в представление
        model.addAttribute("teacher", personDAO.show(id));
        return "users/teacher/HomePageTeacher";
    }

}
