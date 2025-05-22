package FactoryPattern.Abstract.Pizza;

import FactoryPattern.Abstract.Ingredients.ChicagoPizzaIngredientFactory;
import FactoryPattern.Abstract.Ingredients.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;
    public ChicagoStyleClamPizza(){
        this.name = "ChicagoStyleClamPizza";
        this.ingredientFactory = new ChicagoPizzaIngredientFactory();
    }
    @Override
    public void prepare(){
        System.out.println("Preparing ChicagoStyleClamPizza");

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
