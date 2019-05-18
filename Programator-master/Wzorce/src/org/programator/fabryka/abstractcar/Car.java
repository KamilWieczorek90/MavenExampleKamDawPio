package org.programator.fabryka.abstractcar;

abstract class Car {
    private CarType model;
    private Location location;

    Car(CarType model, Location location) {
        this.model = model;
        this.location = location;
    }

    abstract void construct();


    CarType getModel() {
        return model;
    }

    void setModel(CarType model) {
        this.model = model;
    }

    Location getLocation() {
        return location;
    }

    void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "CarModel - " + model + " located in " + location;
    }
}