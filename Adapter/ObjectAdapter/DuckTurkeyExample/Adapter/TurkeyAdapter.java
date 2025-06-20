package Adapter.ObjectAdapter.DuckTurkeyExample.Adapter;

import Adapter.ObjectAdapter.DuckTurkeyExample.Duck.Duck;
import Adapter.ObjectAdapter.DuckTurkeyExample.Turkey.Turkey;

public class TurkeyAdapter implements Duck{
    Turkey turkey;
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }
    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();    
        }
    }
    @Override
    public void quack() {
        turkey.gobble();
    }
}
