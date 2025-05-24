package Adapter.ObjectAdapter.DuckTurkeyExample;

import Adapter.ObjectAdapter.DuckTurkeyExample.Adapter.TurkeyAdapter;
import Adapter.ObjectAdapter.DuckTurkeyExample.Duck.Duck;
import Adapter.ObjectAdapter.DuckTurkeyExample.Duck.MallardDuck;
import Adapter.ObjectAdapter.DuckTurkeyExample.Turkey.Turkey;
import Adapter.ObjectAdapter.DuckTurkeyExample.Turkey.WildTurkey;

public class DuckTurkeyExample {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(turkey);
        System.out.println("Testing Duck");
        testDuck(duck);
        System.out.println("\n\n");
        System.out.println("Testing Turkey");
        testDuck(turkeyAdapter);


    }
    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
