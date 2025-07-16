package IteratorPattern.classes;
import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> items;
    
    public PancakeHouseMenu(){
        this.items = new ArrayList<>();
        addItem("Pancake Breakfast", "Pancakes with scrambled eggs, and toast", true, 2.99);
        addItem("Regular Pancake Breakfast", "Pancakes with fried eggs, sausage", false, 2.99);
        addItem("Blueberry Pancakes", "Pancakes made with fresh blueberries", true, 3.49);
        addItem("Waffles", "Waffles with your choice of blueberries or strawberries", true, 3.59);
    }
    public PancakeHouseMenu(List<MenuItem> items){
        this.items = items;
    }
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        items.add(menuItem);
    }


    
}
