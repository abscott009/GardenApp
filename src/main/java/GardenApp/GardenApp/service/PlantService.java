package GardenApp.GardenApp.service;

import GardenApp.GardenApp.model.Location;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;
import java.sql.*;

public class PlantService {

    @Id
    @GeneratedValue
    private Long id;

//import from weather site/api per Location

    @Autowired
    LocationService growthZone;

    @OneToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
    private Integer zone;

    public static String getPlantSchedule(String schedule) {

        String growthZone = null;

        String plantSch = null;

        try {
            // Connect to the database
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/gardenDB", "root", "${PWEV}");

            // Prepare the SQL query
            String sql = "SELECT plant_sch FROM plant_by_zone WHERE growth_zone = ?, plant = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, plantSch);

            // Execute the query
            ResultSet rs = stmt.executeQuery();

            // Get the climate zone from the result set
            if (rs.next()) {
                plantSch = rs.getString("growth_zone");
            }

            // Close the database connection and resources
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return plantSch;
    }

}
