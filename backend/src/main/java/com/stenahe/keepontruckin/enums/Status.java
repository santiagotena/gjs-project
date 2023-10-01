package com.stenahe.keepontruckin.enums;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Status {
    public enum DriverStatus {
        REST("rest"),
        DRIVING("driving");

        private final String value;

        DriverStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum TruckStatus {
        OK("ok"),
        NOK("nok");

        private final String value;

        TruckStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public enum CargoStatus {
        READY("ready"),
        SHIPPED("shipped"),
        DELIVERED("delivered");

        private final String value;

        CargoStatus(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
