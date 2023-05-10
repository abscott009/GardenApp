package GardenApp.GardenApp.model;
import lombok.*;
import java.sql.*;
import javax.persistence.*;

public class Location {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private Integer zip;

    //feed to Plant and Weather
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private String climateZone = null;


}
