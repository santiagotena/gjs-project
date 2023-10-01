package com.stenahe.keepontruckin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Waypoint {
    @Id
    @SequenceGenerator(
            name = "waypointSequence",
            sequenceName = "waypointSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "waypointSequence"
    )
    private Long waypointId;
    private String destinationCity;
    private String cargoId;
    private String type; //loading unloading
}
