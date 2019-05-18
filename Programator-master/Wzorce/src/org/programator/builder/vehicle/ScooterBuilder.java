package org.programator.builder.vehicle;

public class ScooterBuilder extends VehicleBuilder {
    public ScooterBuilder() {
        vehicle = new Vehicle("Scooter");
    }

    public void buildFrame() {

        vehicle.addPart("frame", "Scooter Frame");
    }

    public void buildEngine() {
        vehicle.addPart("engine", "50 cc");
    }

    public void buildWheels() {
        vehicle.addPart("wheels", "2");
    }

    public void buildDoors() {
        vehicle.addPart("doors", "0");
    }
}
