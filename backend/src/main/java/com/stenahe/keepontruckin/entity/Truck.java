package com.stenahe.keepontruckin.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
    private Long truckId; // 4 digits (from 0000 to 9999) + 3 letters
    private double capacityTonnes;
    private String status; //OK NOK
    private String currentCity;
}
