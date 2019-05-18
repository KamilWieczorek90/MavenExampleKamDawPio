package org.programator.adapter.zoo;

public class Main {
    public static void main(String[] args) {
        System.out.println(Factory.create(AnimalType.DONKEY));
        System.out.println(Factory.create(AnimalType.SHEEP));
        System.out.println(Factory.create(AnimalType.WOLF));
        System.out.println(Factory.create(AnimalType.MAMUT));

        Wolf wolf = new Wolf();
        System.out.println(wolf.latinName());
    }
}
