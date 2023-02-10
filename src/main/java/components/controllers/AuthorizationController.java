package components.controllers;

import components.dao.PersonDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class AuthorizationController {
    private final PersonDAO personDAO;

    @Autowired
    public AuthorizationController(PersonDAO personDAO){
        this.personDAO = personDAO;
    }

    @GetMapping
    public String authorization(){
        return "authorization";
    }

    @PostMapping("/person/{id}")
    public String home(@RequestBody String auth){
        
    }

}
