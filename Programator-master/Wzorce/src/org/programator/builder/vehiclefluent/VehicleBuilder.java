package org.programator.builder.vehiclefluent;

abstract class VehicleBuilder {
    protected Vehicle vehicle;

    public Vehicle getVehicle() {
        return vehicle;
    }

    public abstract VehicleBuilder buildFrame();

    public abstract VehicleBuilder buildEngine();

    public abstract VehicleBuilder buildWheels();

    public abstract VehicleBuilder buildDoors();
}
