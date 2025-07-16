package IteratorPattern.iterators;
import IteratorPattern.classes.MenuItem;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{
    List<MenuItem> items;
    int position = 0;
    public PancakeHouseMenuIterator(List<MenuItem> items){
        this.items = items;
    }
    @Override
    public boolean hasNext() {
        return position < items.size();
    }
    @Override
    public MenuItem next() {
        MenuItem item = items.get(this.position);
        this.position++;
        return item;
    }
}
