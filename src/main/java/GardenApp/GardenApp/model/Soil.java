package GardenApp.GardenApp.model;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "soil_types")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Soil {

    @Id
    @GeneratedValue
    private Long id;

    //find list of soil types to select from
    @Column(nullable = false, unique = true)
    private String type;

    //default per soil type or set based on user input
    @Column
    private long ph;


    @Column
    private boolean dry;
}
