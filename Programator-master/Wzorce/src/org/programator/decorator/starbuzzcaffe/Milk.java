package org.programator.decorator.starbuzzcaffe;

public class Milk extends CondimentDecorator {
//	Beverage beverage;

	public Milk(Beverage beverage) {
		super(beverage);
	}

	public String getDescription() {
		return beverage.getDescription() + ", Milk";
	}

	public double cost() {
		return .10 + beverage.cost();
	}
}
