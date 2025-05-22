package FactoryPattern.Abstract.Ingredients;

import java.util.ArrayList;

import FactoryPattern.Abstract.Ingredients.Cheese.Cheese;
import FactoryPattern.Abstract.Ingredients.Cheese.ReggianoCheese;
import FactoryPattern.Abstract.Ingredients.Clams.Clams;
import FactoryPattern.Abstract.Ingredients.Clams.FreshClams;
import FactoryPattern.Abstract.Ingredients.Dough.Dough;
import FactoryPattern.Abstract.Ingredients.Dough.ThinCrustDough;
import FactoryPattern.Abstract.Ingredients.Pepperoni.Pepperoni;
import FactoryPattern.Abstract.Ingredients.Pepperoni.SlicedPepperoni;
import FactoryPattern.Abstract.Ingredients.Sauce.MarinaraSauce;
import FactoryPattern.Abstract.Ingredients.Sauce.Sauce;
import FactoryPattern.Abstract.Ingredients.Veggies.Spinach;
import FactoryPattern.Abstract.Ingredients.Veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    public Dough createDough() {
        return new ThinCrustDough();
    }
    
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    
    public Cheese createCheese() {
        return new ReggianoCheese();
    }
    
    public ArrayList<Veggies> createVeggies() {
        ArrayList<Veggies> veggies = new ArrayList<>();
        veggies.add(new Spinach());
        return veggies;
    }
    
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }
    
    public Clams createClams() {
        return new FreshClams();
    }
}
