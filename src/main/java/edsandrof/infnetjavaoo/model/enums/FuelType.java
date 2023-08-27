package main.java.edsandrof.infnetjavaoo.model.enums;

import main.java.edsandrof.infnetjavaoo.exceptions.InvalidEnumType;

public enum FuelType {
    GASOLINE,
    ETHANOL,
    DIESEL;

    public static FuelType safeValueOf(String value) {
        try {
            return FuelType.valueOf(value);

        } catch (IllegalArgumentException e) {
            throw new InvalidEnumType("Error in value of FuelType enum: " + e.getMessage());
        }
    }
}
