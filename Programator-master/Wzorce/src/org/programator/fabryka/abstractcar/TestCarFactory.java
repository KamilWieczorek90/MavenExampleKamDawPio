package org.programator.fabryka.abstractcar;

public class TestCarFactory {
    public static void main(String[] args) {
        RealRandomFactory factory = new RealRandomFactory();

        System.out.println(factory.createCar(CarType.MINI));
        System.out.println(factory.createCar(CarType.MICRO));
        System.out.println(factory.createCar(CarType.LUXURY));
    }
}
