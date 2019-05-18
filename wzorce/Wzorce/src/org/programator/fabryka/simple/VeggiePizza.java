package org.programator.fabryka.simple;

import org.programator.fabryka.simple.Pizza;

public class VeggiePizza extends Pizza {
	public VeggiePizza() {
		setName("Veggie Pizza");
		setDough("Crust");
		setSauce("Marinara sauce");
		getToppings().add("Shredded mozzarella");
		getToppings().add("Grated parmesan");
		getToppings().add("Diced onion");
		getToppings().add("Sliced mushrooms");
		getToppings().add("Sliced red pepper");
		getToppings().add("Sliced black olives");
	}
}
