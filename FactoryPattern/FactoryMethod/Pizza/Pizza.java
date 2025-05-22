package FactoryPattern.FactoryMethod.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList <String> toppings = new ArrayList<>();
    public void prepare(){
        System.out.println("Preparing "+ name);
        System.out.println("Preparing Dough");
        System.out.println("Preparing sauce");
        for (String topping : toppings) {
            System.out.println("Adding "+topping);
        }
    }
    public void bake(){
        System.out.println("Baking");
    }
    public void cut(){
        System.out.println("Cutting");
    }
    public void box(){
        System.out.println("Boxing");
    }
    //Getter
    public String getName() {
        return this.name;
    }
}
