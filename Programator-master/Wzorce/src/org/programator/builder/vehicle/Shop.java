package org.programator.builder.vehicle;

public class Shop {
    public void construct(VehicleBuilder vehicleBuilder) {
        vehicleBuilder.buildFrame();
        vehicleBuilder.buildEngine();
        vehicleBuilder.buildWheels();
        vehicleBuilder.buildDoors();
    }
}
