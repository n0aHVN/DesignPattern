package FactoryPattern.Abstract.PizzaStore;

import FactoryPattern.Abstract.Pizza.ChicagoStyleClamPizza;
import FactoryPattern.Abstract.Pizza.ChicagoStyleCheesePizza;
import FactoryPattern.Abstract.Pizza.ChicagoStylePepperoniPizza;
import FactoryPattern.Abstract.Pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type){
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            default:
                return null;
        }
    }
}
