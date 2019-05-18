package org.programator.decorator.starbuzzcaffe;
 
public class Whip extends CondimentDecorator {
	//Beverage beverage;
 
	public Whip(Beverage beverage) {
		super(beverage);
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}
 
	public double cost() {
		return .10 + beverage.cost();
	}
}
