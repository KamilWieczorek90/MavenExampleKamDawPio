package org.programator.builder.vehiclefluent;

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();

        Vehicle scooter = shop.construct(new ScooterBuilder());
        System.out.println(scooter);

        System.out.println(shop.construct(new CarBuilder()));

        VehicleBuilder vb = new ScooterBuilder();
        Vehicle v1 = vb.buildDoors().getVehicle();
        System.out.println(v1);
        Vehicle v2 = vb.buildEngine().getVehicle();
        System.out.println(v2);

        System.out.println(v1 == v2);
    }
}
