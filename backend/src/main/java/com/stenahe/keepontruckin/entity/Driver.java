package com.stenahe.keepontruckin.entity;

import com.stenahe.keepontruckin.enums.Status;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
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
    @Enumerated(EnumType.STRING)
    private Status.DriverStatus driverStatus;
    private String currentCity;
    @Pattern(
            regexp = "^\\d{4}[a-zA-Z]{3}$",
            message = "Name does not match 4 digits (from 0000 to 9999) + 3 letters."
    )
    private String currentTruck; // OneToOne + JoinColumn
}
