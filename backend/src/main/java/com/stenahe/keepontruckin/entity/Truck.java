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
    private Long truckId;
    private double capacity;
    private String status;
    private String currentCity;
}
