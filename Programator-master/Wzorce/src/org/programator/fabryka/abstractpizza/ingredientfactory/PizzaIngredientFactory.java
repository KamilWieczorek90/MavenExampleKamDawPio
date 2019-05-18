package org.programator.fabryka.abstractpizza.ingredientfactory;

import org.programator.fabryka.abstractpizza.ingredients.cheese.Cheese;
import org.programator.fabryka.abstractpizza.ingredients.clams.Clams;
import org.programator.fabryka.abstractpizza.ingredients.dough.Dough;
import org.programator.fabryka.abstractpizza.ingredients.pepperoni.Pepperoni;
import org.programator.fabryka.abstractpizza.ingredients.sauce.Sauce;
import org.programator.fabryka.abstractpizza.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
 
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clams createClam();
 
}
