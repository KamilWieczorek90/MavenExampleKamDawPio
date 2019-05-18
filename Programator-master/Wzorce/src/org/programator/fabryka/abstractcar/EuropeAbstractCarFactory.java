package org.programator.fabryka.abstractcar;

public class EuropeAbstractCarFactory implements AbstractCarFactory {
    @Override
    public Car createCar(CarType model) {
        Car car;
        switch (model) {
            case MICRO:
                car = new MicroCar(Location.EUROPE);
                break;
            case MINI:
                car = new MiniCar(Location.EUROPE);
                break;
            case LUXURY:
                car = new LuxuryCar(Location.EUROPE);
                break;
            default:
                car = null;
        }
        return car;
    }
}
