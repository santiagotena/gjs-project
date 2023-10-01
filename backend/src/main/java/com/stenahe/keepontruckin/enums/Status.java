package com.stenahe.keepontruckin.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Status {
    public enum DriverStatus {
        REST,
        DRIVING
    }

    public enum TruckStatus {
        OK,
        NOK
    }

    public enum CargoStatus {
        READY,
        SHIPPED,
        DELIVERED
    }
}
