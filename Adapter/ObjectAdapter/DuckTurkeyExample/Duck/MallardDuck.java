package Adapter.ObjectAdapter.DuckTurkeyExample.Duck;

public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("MallardDuck is flying!");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
