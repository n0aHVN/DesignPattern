package FactoryPattern.FactoryMethod.PizzaStore;

import FactoryPattern.FactoryMethod.Pizza.Pizza;

public abstract class PizzaStore{
    public Pizza orderPizza(String type){
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //This is Factory Method
    abstract protected Pizza createPizza(String type);
}