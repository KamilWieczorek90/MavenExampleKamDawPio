package org.programator.builder.vehiclefluent;

class CarBuilder extends VehicleBuilder {
    public CarBuilder() {
        vehicle = new Vehicle("Car");
    }

    public VehicleBuilder buildFrame() {
        vehicle.addPart("frame", "Car Frame");
        return this;
    }

    public VehicleBuilder buildEngine() {
        vehicle.addPart("engine", "2500 cc");
        return this;
    }

    public VehicleBuilder buildWheels() {
        vehicle.addPart("wheels", "4");
        return this;
    }

    public VehicleBuilder buildDoors() {
        vehicle.addPart("doors", "4");
        return this;
    }
}
