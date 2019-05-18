package org.programator.builder.vehicle;

class CarBuilder extends VehicleBuilder {
    public CarBuilder() {
        vehicle = new Vehicle("Car");
    }

    public void buildFrame() {
        vehicle.addPart("frame", "Car Frame");
    }

    public void buildEngine() {
        vehicle.addPart("engine", "2500 cc");
    }

    public void buildWheels() {
        vehicle.addPart("wheels", "4");
    }

    public void buildDoors() {
        vehicle.addPart("doors", "4");
    }
}
