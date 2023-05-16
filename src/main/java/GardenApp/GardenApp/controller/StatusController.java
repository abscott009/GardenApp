package GardenApp.GardenApp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
public class StatusController {

    @GetMapping(path = "/status")
    public ResponseEntity<String> status() {
        return ResponseEntity.ok().body("status: ok");
    }
}
