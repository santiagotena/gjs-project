package com.stenahe.keepontruckin.entity;

import com.stenahe.keepontruckin.enums.Types;
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
    @OneToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER,
            optional = false

    )
    @JoinColumn(
            name = "cargo_id",
            referencedColumnName = "cargoId"
    )
    private Cargo cargo;
    @Enumerated(EnumType.STRING)
    private Types.ActionType actionType;
}
