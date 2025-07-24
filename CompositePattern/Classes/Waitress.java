package CompositePattern.Classes;

public class Waitress {
    MenuComponent menuComponent;
    public Waitress(MenuComponent menuComponent){
        this.menuComponent = menuComponent;
    }
    public void printMenu(){
        this.menuComponent.print();
    }
}
