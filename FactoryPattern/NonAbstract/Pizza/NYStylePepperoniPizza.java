package FactoryPattern.NonAbstract.Pizza;

public class NYStylePepperoniPizza extends Pizza {
    public NYStylePepperoniPizza(){
        this.name = "NYStylePepperoniPizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
        toppings.add("Sliced Pepperoni");
    }
}
