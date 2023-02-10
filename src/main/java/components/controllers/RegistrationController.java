package components.controllers;

import components.dao.PersonDAO;
import components.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegistrationController {
    private final PersonDAO personDAO;

    @Autowired
    public RegistrationController(PersonDAO personDAO){
        this.personDAO = personDAO;
    }

    @GetMapping("/registration")
    public String registration(Model model){
        model.addAttribute("person", new Person());
        return "registration";
    }

    @PostMapping()
    public String create(@ModelAttribute("person") Person person){
        person.setId(30);
        personDAO.save(person);
        personDAO.sout();
        return "redirect:/";
    }
}
