package GardenApp.GardenApp.controller;

import GardenApp.GardenApp.service.LocationService;
import org.apache.http.HttpException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @GetMapping(path = "/hardiness")
    public String getHardinessZoneByZipCode(@RequestParam Integer zipCode) {
        String hardinessZone;
        try {
            hardinessZone = locationService.getHardinessZoneByZipCode(zipCode);
        } catch (Exception e) {
            return "NOT FOUND";
        }

        return hardinessZone;
    }
}
