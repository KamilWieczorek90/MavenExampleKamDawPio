package org.programator.decorator.starbuzzcaffe;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}

