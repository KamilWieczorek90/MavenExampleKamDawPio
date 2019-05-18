package org.programator.fabryka.simple;

public class PepperoniPizza extends Pizza {
	public PepperoniPizza() {
		setName("Pepperoni Pizza");
		setDough("Crust");
		setSauce("Marinara sauce");
		getToppings().add("Sliced Pepperoni");
		getToppings().add("Sliced Onion");
		getToppings().add("Grated parmesan cheese");
	}
}
