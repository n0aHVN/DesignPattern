package FactoryPattern.FactoryMethod;

import FactoryPattern.FactoryMethod.Pizza.Pizza;
import FactoryPattern.FactoryMethod.PizzaStore.ChicagoPizzaStore;
import FactoryPattern.FactoryMethod.PizzaStore.NYPizzaStore;
import FactoryPattern.FactoryMethod.PizzaStore.PizzaStore;

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
