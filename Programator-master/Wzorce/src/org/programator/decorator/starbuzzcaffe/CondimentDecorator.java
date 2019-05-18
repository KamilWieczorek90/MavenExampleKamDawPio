package org.programator.decorator.starbuzzcaffe;

public abstract class CondimentDecorator extends Beverage {
	protected Beverage beverage;

	protected CondimentDecorator(Beverage beverage) {
		this.beverage = beverage;
	}

	public abstract String getDescription();
}
