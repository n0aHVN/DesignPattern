package FactoryPattern.NonAbstract;

import FactoryPattern.NonAbstract.Pizza.Pizza;
import FactoryPattern.NonAbstract.PizzaStore.ChicagoPizzaStore;
import FactoryPattern.NonAbstract.PizzaStore.NYPizzaStore;
import FactoryPattern.NonAbstract.PizzaStore.PizzaStore;

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
