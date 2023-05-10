package GardenApp.GardenApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage() {
        return "/home";
    }

    @GetMapping("/zone")
    public String adminPage() {
        return "/zone";
    }

    @GetMapping("/plant")
    public String superUPage() {
        return "/plant";
    }


}