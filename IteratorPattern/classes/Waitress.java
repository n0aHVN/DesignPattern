package IteratorPattern.classes;

import IteratorPattern.iterators.Iterator;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinnerMenu dinnerMenu;
    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinnerMenu dinnerMenu){
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinnerMenu = dinnerMenu;
    }
    public void printMenu(){
        Iterator pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();

        System.out.println("MENU BREAKFAST");
        printMenu(pancakeIterator);
        System.out.println("MENU LUNCH");
        printMenu(dinnerIterator);
    }
    public void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem item = iterator.next();
            System.out.print(item.getName()+ ", ");
            System.out.print(item.getName()+ " -- ");
            System.out.println(item.getDescription());
        }
    }
    public void printVegetarianMenu(Iterator iteartor){
        while (iteartor.hasNext()){
            MenuItem item = iteartor.next();
            if (item.vegetarian){
                System.out.print(item.getName()+ ", ");
                System.out.print(item.getName()+ " -- ");
                System.out.println(item.getDescription());
            }
        }
    }
    public void isItemVegetarian(MenuItem item){
        System.out.println(item.vegetarian);
    }
}
