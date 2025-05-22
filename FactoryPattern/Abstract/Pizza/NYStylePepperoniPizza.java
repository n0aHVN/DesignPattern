package FactoryPattern.Abstract.Pizza;

import FactoryPattern.Abstract.Ingredients.NYPizzaIngredientFactory;
import FactoryPattern.Abstract.Ingredients.PizzaIngredientFactory;

public class NYStylePepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public NYStylePepperoniPizza(){
        this.name = "NYStylePepperoniPizza";
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }
    @Override
    public void prepare(){
        System.out.println("Preparing NYStylePepperoniPizza");

        this.dough = ingredientFactory.createDough();
        System.out.println("Creating "+this.dough.toString());

        this.sauce = ingredientFactory.createSauce();
        System.out.println("Creating "+this.sauce.toString());

        this.veggies = ingredientFactory.createVeggies();
        System.out.println("Creating "+this.veggies.toString());

        this.pepperoni = ingredientFactory.createPepperoni();
        System.out.println("Creating "+this.pepperoni.toString());


        this.clams = ingredientFactory.createClams();
        System.out.println("Creating "+this.clams.toString());
    }
}
