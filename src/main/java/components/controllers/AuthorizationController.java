package components.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthorizationController {
    @GetMapping
    public String authorization(){
        return "authorization";
    }

    @GetMapping("/registration")
    public String registration(){
        return "registration";
    }
}
