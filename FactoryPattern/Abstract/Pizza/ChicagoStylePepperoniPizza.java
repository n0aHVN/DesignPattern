package FactoryPattern.Abstract.Pizza;

import FactoryPattern.Abstract.Ingredients.ChicagoPizzaIngredientFactory;
public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        ingredientFactory = new ChicagoPizzaIngredientFactory();
    }

    @Override
    public void cut() {
        System.out.println("Cutting in squares");
    }

    @Override
    public void prepare(){
        System.out.println("Preparing ChicagoStylePepperoniPizza");

        this.dough = ingredientFactory.createDough();
        System.out.println("Creating "+this.dough.toString());

        this.sauce = ingredientFactory.createSauce();
        System.out.println("Creating "+this.sauce.toString());

        this.pepperoni = ingredientFactory.createPepperoni();
        System.out.println("Creating "+this.pepperoni.toString());
    }
}
