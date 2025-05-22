package FactoryPattern.Abstract;

import FactoryPattern.Abstract.Pizza.Pizza;
import FactoryPattern.Abstract.PizzaStore.ChicagoPizzaStore;
import FactoryPattern.Abstract.PizzaStore.NYPizzaStore;
import FactoryPattern.Abstract.PizzaStore.PizzaStore;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");
    }
}
