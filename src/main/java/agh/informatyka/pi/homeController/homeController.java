package agh.informatyka.pi.homeController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {

    @GetMapping("/")
    @ResponseBody
    public String homePage(){
        return "hello";
    }
}
