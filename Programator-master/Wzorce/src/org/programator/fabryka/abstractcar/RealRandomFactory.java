package org.programator.fabryka.abstractcar;

import java.util.Random;

public class RealRandomFactory implements AbstractCarFactory {
    @Override
    public Car createCar(CarType model) {
        Random random = new Random();
        Location[] locations = Location.values();
        // random GPS :)
        Location carRandomLocation = locations[random.nextInt(locations.length)];
        Car car;

        switch (carRandomLocation) {
            case ASIA:
                car = CarFactory.getCar(new AsiaAbstractCarFactory(), model);
                break;
            case EUROPE:
                car = CarFactory.getCar(new EuropeAbstractCarFactory(), model);
                break;
            case AMERICA:
                car = CarFactory.getCar(new AmericaAbstractCarFactory(), model);
                break;
            default:
                car = null;
        }
        return car;
    }
}
