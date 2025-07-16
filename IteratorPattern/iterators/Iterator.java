package IteratorPattern.iterators;

import IteratorPattern.classes.MenuItem;

public interface Iterator {
    boolean hasNext();
    MenuItem next();
    
}
