package FactoryPattern.NonAbstract.PizzaStore;

import FactoryPattern.NonAbstract.Pizza.NYStyleCheesePizza;
import FactoryPattern.NonAbstract.Pizza.NYStylePepperoniPizza;
import FactoryPattern.NonAbstract.Pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
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