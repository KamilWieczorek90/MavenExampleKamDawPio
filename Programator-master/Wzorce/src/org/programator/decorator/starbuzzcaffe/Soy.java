package org.programator.decorator.starbuzzcaffe;

public class Soy extends CondimentDecorator {
	//Beverage beverage;

	public Soy(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return .15 + beverage.cost();
	}
}
