package org.programator.fabryka.abstractcar;

class MiniCar extends Car {
    MiniCar(Location location) {
        super(CarType.MINI, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Mini car: constructed");
    }
}
