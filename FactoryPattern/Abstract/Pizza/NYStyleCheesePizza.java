package FactoryPattern.Abstract.Pizza;

import FactoryPattern.Abstract.Ingredients.NYPizzaIngredientFactory;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        this.name = "NYStyleCheesePizza";
        this.ingredientFactory = new NYPizzaIngredientFactory();
    }

    @Override
    public void prepare(){
        System.out.println("Preparing NYStyleCheesePizza");

        this.dough = ingredientFactory.createDough();
        System.out.println("Creating "+this.dough.toString());

        this.sauce = ingredientFactory.createSauce();
        System.out.println("Creating "+this.sauce.toString());

        this.pepperoni = ingredientFactory.createPepperoni();
        System.out.println("Creating "+this.pepperoni.toString());

    }

}
