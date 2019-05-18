package org.programator.fabryka.abstractpizza.ingredientfactory;

import org.programator.fabryka.abstractpizza.ingredients.cheese.*;
import org.programator.fabryka.abstractpizza.ingredients.clams.*;
import org.programator.fabryka.abstractpizza.ingredients.dough.*;
import org.programator.fabryka.abstractpizza.ingredients.pepperoni.*;
import org.programator.fabryka.abstractpizza.ingredients.sauce.*;
import org.programator.fabryka.abstractpizza.ingredients.veggies.*;

public class ChicagoPizzaIngredientFactory 
	implements PizzaIngredientFactory
{
	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = { new BlackOlives(), 
		                      new Spinach(), 
		                      new Eggplant() };
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
