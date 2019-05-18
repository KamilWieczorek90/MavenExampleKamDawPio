package org.programator.adapter.zoo;

public class Factory {
    public static IAnimal create(AnimalType animalType){
        IAnimal animal = null;
        switch (animalType){
            case DONKEY:
                animal = new Donkey();
                break;
            case SHEEP:
                animal = new Sheep();
                break;
            case WOLF:
                animal = new WolfAdapted();
                break;
            case MAMUT:
                animal = new Slon();
                break;\7
        }
        return animal;
    }
}
