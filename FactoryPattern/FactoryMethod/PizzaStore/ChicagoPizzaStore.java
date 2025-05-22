package FactoryPattern.FactoryMethod.PizzaStore;

import FactoryPattern.FactoryMethod.Pizza.ChicagoStyleCheesePizza;
import FactoryPattern.FactoryMethod.Pizza.ChicagoStylePepperoniPizza;
import FactoryPattern.FactoryMethod.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type){
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            default:
                return null;
        }
    }
}
