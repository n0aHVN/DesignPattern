package CompositePattern.Classes;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> list = new ArrayList<>();
    String name;
    String description;

    public Menu(String name, String description){
        this.name = name;
        this.description = description;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        list.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        list.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return list.get(i);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
    @Override
    public void print() {
        System.out.println("\n"+getName());
        System.out.println(", "+ getDescription());
        System.out.println("--------------------");
        for (MenuComponent component : this.list){
            component.print();
        }
    }
}
