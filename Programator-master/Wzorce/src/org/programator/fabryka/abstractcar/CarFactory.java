package org.programator.fabryka.abstractcar;

public class CarFactory {
    public static Car getCar(AbstractCarFactory factory, CarType carType){
        return factory.createCar(carType);
    }
}
