package GardenApp.GardenApp.model;
import lombok.*;

import javax.persistence.*;

@Entity
    @Table(name = "plant")
    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @Builder
    @ToString

public class Veggie {


        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(nullable = false, unique = true)
        private String name;

//        @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.LAZY)
//        private Location growthZone;
//
//        private String sunType;
//
//        @Column(nullable = false)
//        private boolean fruitBearing;

 //       private Integer numDaysTillRipeFruit;

//        @PrePersist
//        @PreUpdate
//        private void checkForIllegalState() {
//            if(!fruitBearing && !Objects.isNull(numDaysTillRipeFruit)) {
//                throw new IllegalStateException("If the plant is not fruit bearing you cannot set numDaysTillRipeFruit");
//            }


}
