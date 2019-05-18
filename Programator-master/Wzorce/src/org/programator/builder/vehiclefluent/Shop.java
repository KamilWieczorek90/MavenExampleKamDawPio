package org.programator.builder.vehiclefluent;

public class Shop {
    public Vehicle construct(VehicleBuilder vehicleBuilder) {

        return vehicleBuilder
                .buildFrame()
                .buildEngine()
                .buildWheels()
                .buildDoors()
                .getVehicle();
    }
}
