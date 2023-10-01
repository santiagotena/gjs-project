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
public class Driver {
    @Id
    @SequenceGenerator(
            name = "driverSequence",
            sequenceName = "driverSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "driverSequence"
    )
    private Long driverId;
    private String firstName;
    private String lastName;
    private double remainingMonthlyHours;
    private String status; //rest driving
    private String currentCity;
    private String currentTruck;
}
