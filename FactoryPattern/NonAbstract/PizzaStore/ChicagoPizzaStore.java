package FactoryPattern.NonAbstract.PizzaStore;

import FactoryPattern.NonAbstract.Pizza.ChicagoStyleCheesePizza;
import FactoryPattern.NonAbstract.Pizza.ChicagoStylePepperoniPizza;
import FactoryPattern.NonAbstract.Pizza.Pizza;

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
