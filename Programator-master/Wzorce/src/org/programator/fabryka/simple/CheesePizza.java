package org.programator.fabryka.simple;

public class CheesePizza extends Pizza {
	public CheesePizza() {
		setName("Cheese Pizza");
		setDough("Regular Crust");
		setSauce("Marinara Pizza Sauce");
		getToppings().add("Fresh Mozzarella");
		getToppings().add("Parmesan");
	}
}
