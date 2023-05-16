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
    public String zonePage() {
        return "/zone";
    }

    @GetMapping("/plant")
    public String plantSchPage() {
        return "/plant";
    }


}