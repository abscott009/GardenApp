package GardenApp.GardenApp.model;
import lombok.*;
import java.sql.*;
import javax.persistence.*;

@Builder
@Getter
public class Location {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, unique = true)
    private Integer zip;

    @Column(nullable = false)
    private String hardinessZone = null;


}
