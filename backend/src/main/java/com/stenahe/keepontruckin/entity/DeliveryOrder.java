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
public class DeliveryOrder {
    @Id
    @SequenceGenerator(
            name = "deliveryOrderSequence",
            sequenceName = "deliveryOrderSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "deliveryOrderSequence"
    )
    private Long orderId;
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
