package tacos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "home";
    }


//    @GetMapping("/oauth2/authorization/taco-admin-client")
//    public String oauth2() {
//
//        return "";
//    }

}
