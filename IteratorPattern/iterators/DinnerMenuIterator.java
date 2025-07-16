package IteratorPattern.iterators;

import IteratorPattern.classes.MenuItem;

public class DinnerMenuIterator implements Iterator {
    MenuItem[] items;
    int position = 0;

    public DinnerMenuIterator(MenuItem[] items){
        this.items = items;
    }

    @Override
    public MenuItem next() {
        MenuItem item = this.items[position];
        position += 1;
        return item;
    }
    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }
        else return true;
    }
}
