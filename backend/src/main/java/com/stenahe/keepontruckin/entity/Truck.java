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
public class Truck {
    @Id
    @Pattern(
            regexp = "^\\d{4}[a-zA-Z]{3}$",
            message = "Name does not match 4 digits (from 0000 to 9999) + 3 letters."
    )
    private String truckId;
    private double capacityTonnes;
    @Enumerated(EnumType.STRING)
    private Status.TruckStatus truckStatus;
    private String currentCity;
}
