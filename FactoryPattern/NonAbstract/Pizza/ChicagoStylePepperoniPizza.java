package FactoryPattern.NonAbstract.Pizza;

public class ChicagoStylePepperoniPizza extends Pizza {
    public ChicagoStylePepperoniPizza() {
        name = "Chicago Style Pepperoni Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Sliced Pepperoni");
    }

    @Override
    public void cut() {
        System.out.println("Cutting in squares");
    }
}
