package com.stenahe.keepontruckin.entity;

import com.stenahe.keepontruckin.enums.Status;
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
public class Cargo {
    @Id
    @SequenceGenerator(
            name = "cargoSequence",
            sequenceName = "cargoSequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cargoSequence"
    )
    private Long cargoId;
    private String cargoName;
    private double weightKg;
    @Enumerated(EnumType.STRING)
    private Status.CargoStatus cargoStatus;
}
