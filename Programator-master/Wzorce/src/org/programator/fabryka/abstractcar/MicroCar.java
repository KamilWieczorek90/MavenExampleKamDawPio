package org.programator.fabryka.abstractcar;

class MicroCar extends Car {
    MicroCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    protected void construct() {
        System.out.println("Micro Car: constructed");
    }
}