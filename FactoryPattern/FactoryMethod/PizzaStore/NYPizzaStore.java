package FactoryPattern.FactoryMethod.PizzaStore;

import FactoryPattern.FactoryMethod.Pizza.NYStyleCheesePizza;
import FactoryPattern.FactoryMethod.Pizza.NYStylePepperoniPizza;
import FactoryPattern.FactoryMethod.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    //This is a factory method
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
            default:
                return null;
        }
    }
}