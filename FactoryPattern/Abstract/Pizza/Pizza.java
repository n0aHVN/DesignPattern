package FactoryPattern.Abstract.Pizza;

import java.util.ArrayList;

import FactoryPattern.Abstract.Ingredients.Clams.Clams;
import FactoryPattern.Abstract.Ingredients.Dough.Dough;
import FactoryPattern.Abstract.Ingredients.Pepperoni.Pepperoni;
import FactoryPattern.Abstract.Ingredients.Sauce.Sauce;
import FactoryPattern.Abstract.Ingredients.Veggies.Veggies;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Pepperoni pepperoni;
    ArrayList <Veggies> veggies;
    Clams clams;

    public abstract void prepare();
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
