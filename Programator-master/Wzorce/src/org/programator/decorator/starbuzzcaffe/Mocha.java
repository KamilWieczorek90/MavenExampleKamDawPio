package org.programator.decorator.starbuzzcaffe;

public class Mocha extends CondimentDecorator {
	//Beverage beverage;
 
	public Mocha(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
