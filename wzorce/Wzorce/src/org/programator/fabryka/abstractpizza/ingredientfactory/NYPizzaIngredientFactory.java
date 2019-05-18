package org.programator.fabryka.abstractpizza.ingredientfactory;

import org.programator.fabryka.abstractpizza.ingredients.cheese.*;
import org.programator.fabryka.abstractpizza.ingredients.clams.*;
import org.programator.fabryka.abstractpizza.ingredients.dough.*;
import org.programator.fabryka.abstractpizza.ingredients.pepperoni.*;
import org.programator.fabryka.abstractpizza.ingredients.sauce.*;
import org.programator.fabryka.abstractpizza.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
 
	public Dough createDough() {
		return new ThinCrustDough();
	}
 
	public Sauce createSauce() {
		return new MarinaraSauce();
	}
 
	public Cheese createCheese() { return new ReggianoCheese(); }
 
	public Veggies[] createVeggies() {
		Veggies veggies[] = { new Garlic(), new Onion(), new Mushroom(), new RedPepper() };
		return veggies;
	}
 
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
