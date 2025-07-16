package IteratorPattern.classes;

public class DinnerMenu {
    MenuItem[] items;
    int numberOfItems = 0;
    static final int MAX_ITEMS = 6;

    public DinnerMenu() {
        items = new MenuItem[MAX_ITEMS];
        addItem("Vegetarian BLT", "Fakin' Bacon with lettuce & tomato on whole wheat", true, 2.99);
        addItem("BLT", "Bacon with lettuce & tomato on whole wheat", false, 2.99);
        addItem("Soup of the day", "A bowl of the soup of the day, with a side salad", false, 3.29);
        addItem("Hotdog", "A hot dog with sauerkraut, relish, onions, topped with cheese", false, 3.05);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            items[numberOfItems] = menuItem;
            numberOfItems++;
        }
    }
    public MenuItem[] getItems() {
        return items;
    }
}
