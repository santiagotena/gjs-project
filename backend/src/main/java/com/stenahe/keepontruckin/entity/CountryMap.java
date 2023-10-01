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
public class CountryMap {
    @Id
    @SequenceGenerator(
            name = "cityPairSequence",
            sequenceName = "cityPairSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cityPairSequence"
    )
    private String cityPairId;
    private String sourceCity;
    private String destinationCity;
    private double distanceKm;
}
