package org.programator.fabryka.simple;

public class ClamPizza extends Pizza {
	public ClamPizza() {
		setName("Clam Pizza");
		setDough("Thin crust");
		setSauce("White garlic sauce");
		getToppings().add("Clams");
		getToppings().add("Grated parmesan cheese");
	}
}
