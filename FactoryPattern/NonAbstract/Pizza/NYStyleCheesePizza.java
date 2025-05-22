package FactoryPattern.NonAbstract.Pizza;

public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza(){
        this.name = "NYStyleCheesePizza";
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }
}
