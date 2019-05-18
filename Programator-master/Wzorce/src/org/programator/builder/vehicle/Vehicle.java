package org.programator.builder.vehicle;

import java.util.*;

public class Vehicle {
    private String vehicleType;
    private Hashtable<String, String> parts = new Hashtable<>();

    public Vehicle(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void addPart(String partName, String partValue) {
        parts.put(partName, partValue);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vehicle Type: ");
        sb.append(vehicleType);
        sb.append(parts.entrySet());
        return sb.toString();
    }
}
