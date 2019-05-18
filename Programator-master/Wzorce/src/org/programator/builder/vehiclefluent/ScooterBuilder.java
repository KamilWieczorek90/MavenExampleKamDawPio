package org.programator.builder.vehiclefluent;

public class ScooterBuilder extends VehicleBuilder {
    public ScooterBuilder() {
        vehicle = new Vehicle("Scooter");
    }

    public VehicleBuilder buildFrame() {
        vehicle.addPart("frame", "Scooter Frame");
        return this;
    }

    public VehicleBuilder buildEngine() {
        vehicle.addPart("engine", "50 cc");
        return this;
    }

    public VehicleBuilder buildWheels() {
        vehicle.addPart("wheels", "2");
        return this;
    }

    public VehicleBuilder buildDoors() {
        vehicle.addPart("doors", "0");
        return this;
    }
}
