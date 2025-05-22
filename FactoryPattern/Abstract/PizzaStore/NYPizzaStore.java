package FactoryPattern.Abstract.PizzaStore;
import FactoryPattern.Abstract.Pizza.NYStyleCheesePizza;
import FactoryPattern.Abstract.Pizza.NYStylePepperoniPizza;
import FactoryPattern.Abstract.Pizza.Pizza;

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