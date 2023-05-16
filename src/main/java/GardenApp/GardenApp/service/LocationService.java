package GardenApp.GardenApp.service;
import GardenApp.GardenApp.model.Location;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class LocationService {

    public String getHardinessZoneByZipCode(Integer zipCode) throws Exception {

        // stub data
        Location location = Location.builder()
                .id(1L)
                .zip(10000)
                .hardinessZone("4b")
                .build();

        Location location1 = Location.builder()
                .id(2L)
                .zip(30000)
                .hardinessZone("2a")
                .build();

        List<Location> locations = new ArrayList<>();
        locations.add(location);
        locations.add(location1);

        HashMap<Integer, Location> map = new HashMap();


        for (Location loc : locations) {
            map.put(loc.getZip(), location);
        }

        Location myLocation = map.get(zipCode);
        if (myLocation == null) {
            throw new Exception("Location Not Found");
        }

        return myLocation.getHardinessZone();

    }



//    public static String getHardinessZone(String zipCode) {
//
//        try {
//            // Connect to the database
//            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/gardenDB", "root", "${PWEV}");
//
//            // Prepare the SQL query
//            String sql = "SELECT hardiness_zone FROM Zip_to_Zone WHERE zip_code = ?";
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setString(1, zipCode);
//
//            // Execute the query
//            ResultSet rs = stmt.executeQuery();
//
//            // Get the climate zone from the result set
//            if (rs.next()) {
//                getHardinessZone() = rs.getString("hardiness_zone");
//            }
//
//            // Close the database connection and resources
//            rs.close();
//            stmt.close();
//            conn.close();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//        return hardinessZone;
//    }


}
