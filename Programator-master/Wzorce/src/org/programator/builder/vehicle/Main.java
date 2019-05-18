package org.programator.builder.vehicle;

public class Main {
    public static void main(String[] args) {
        VehicleBuilder builder;

        Shop shop = new Shop();

        builder = new ScooterBuilder();
        shop.construct(builder);
        System.out.println(builder.getVehicle());

        builder = new CarBuilder();
        shop.construct(builder);
        System.out.println(builder.getVehicle());

//        builder = new MotorcycleBuilder();
//        shop.construct(builder);
//        System.out.println(builder.getVehicle());
    }
}
