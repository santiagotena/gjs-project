package com.stenahe.keepontruckin.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {
    @Id
    @SequenceGenerator(
            name = "orderSequence",
            sequenceName = "orderSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orderSequence"
    )
    private Long cargoId;
    private boolean isOrderCompleted;
    @OneToMany(
            cascade = CascadeType.ALL
    )
    private List<Waypoint> waypoints;
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = false
    )
    @JoinColumn(
            name = "truck_id",
            referencedColumnName = "truckId"
    )
    private Truck truck;
    @OneToMany(
            cascade = CascadeType.ALL
    )
    private List<Driver> drivers;
}
