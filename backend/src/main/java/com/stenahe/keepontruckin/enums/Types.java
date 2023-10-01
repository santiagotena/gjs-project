package com.stenahe.keepontruckin.enums;

public class Types {
    public enum ActionType {
        LOADING("loading"),
        UNLOADING("unloading");

        private final String value;

        ActionType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

    }
}
