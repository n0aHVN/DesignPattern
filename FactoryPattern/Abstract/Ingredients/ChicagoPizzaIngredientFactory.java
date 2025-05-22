package FactoryPattern.Abstract.Ingredients;

import java.util.ArrayList;

import FactoryPattern.Abstract.Ingredients.Cheese.Cheese;
import FactoryPattern.Abstract.Ingredients.Cheese.MozzarellaCheese;
import FactoryPattern.Abstract.Ingredients.Clams.Clams;
import FactoryPattern.Abstract.Ingredients.Clams.FrozenClams;
import FactoryPattern.Abstract.Ingredients.Dough.Dough;
import FactoryPattern.Abstract.Ingredients.Dough.ThickCrustDough;
import FactoryPattern.Abstract.Ingredients.Pepperoni.Pepperoni;
import FactoryPattern.Abstract.Ingredients.Pepperoni.SlicedPepperoni;
import FactoryPattern.Abstract.Ingredients.Sauce.PlumTomatoSauce;
import FactoryPattern.Abstract.Ingredients.Sauce.Sauce;
import FactoryPattern.Abstract.Ingredients.Veggies.BlackOlive;
import FactoryPattern.Abstract.Ingredients.Veggies.Garlic;
import FactoryPattern.Abstract.Ingredients.Veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThickCrustDough();
    }
    
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }
    
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    
    public ArrayList<Veggies> createVeggies() {
        ArrayList<Veggies> veggies = new ArrayList<>();
        veggies.add(new BlackOlive());
        veggies.add(new Garlic());
        return veggies;
    }
    
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    
    public Clams createClams() {
        return new FrozenClams();
    }
}
