package GardenApp.GardenApp.service;
import GardenApp.GardenApp.model.Location;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.*;

public class ZoneService {

    @Id
    @GeneratedValue
    private Long id;

//import from weather site/api per Location

    @Autowired
    Location location;

//    @Column(nullable = false, unique = true)
//    private Integer zip;

//    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
//    private Integer zone;

    private String sunType;

    public static String getClimateZone(String zipCode) {

        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/climate_zones", "root", "${PWEV}");

            // Prepare the SQL query
            String sql = "SELECT climate_zone FROM zip_code_zones WHERE zip_code = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, zipCode);

            // Execute the query
            ResultSet rs = stmt.executeQuery();

            // Get the climate zone from the result set
            if (rs.next()) {
                climateZone = rs.getString("climate_zone");
            }

            // Close the database connection and resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return climateZone;
    }

}
