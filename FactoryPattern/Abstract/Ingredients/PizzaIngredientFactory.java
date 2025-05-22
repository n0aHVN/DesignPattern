package FactoryPattern.Abstract.Ingredients;

import java.util.ArrayList;

import FactoryPattern.Abstract.Ingredients.Cheese.Cheese;
import FactoryPattern.Abstract.Ingredients.Clams.Clams;
import FactoryPattern.Abstract.Ingredients.Dough.Dough;
import FactoryPattern.Abstract.Ingredients.Pepperoni.Pepperoni;
import FactoryPattern.Abstract.Ingredients.Sauce.Sauce;
import FactoryPattern.Abstract.Ingredients.Veggies.Veggies;

//This is Abstract Factory
public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    ArrayList<Veggies> createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}