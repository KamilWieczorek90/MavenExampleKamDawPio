package org.programator.fabryka.abstractcar;

public class AmericaAbstractCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar(CarType model) {
        Car car;
        switch (model) {
            case MICRO:
                car = new MicroCar(Location.AMERICA);
                break;
            case MINI:
                car = new MiniCar(Location.AMERICA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.AMERICA);
                break;
            default:
                car = null;
        }
        return car;
    }
}
