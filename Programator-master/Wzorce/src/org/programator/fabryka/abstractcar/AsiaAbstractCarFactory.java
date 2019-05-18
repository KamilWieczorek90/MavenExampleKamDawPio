package org.programator.fabryka.abstractcar;

public class AsiaAbstractCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar(CarType model) {
        Car car;
        switch (model) {
            case MICRO:
                car = new MicroCar(Location.ASIA);
                break;
            case MINI:
                car = new MiniCar(Location.ASIA);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.ASIA);
                break;
            default:
                car = null;
        }
        return car;
    }
}
