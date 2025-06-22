package TemplateMethodPattern.HollywoodPrinciple.SortingDuckExample.Class;

public class Duck implements Comparable<Duck> {
    String name;
    int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return name + " weighs " + weight;
    }
    // This method overwrites the compareTo method from Comparable interface.
    // Return -1 if this duck is lighter than the other duck,
    // 0 if they weigh the same, and 1 if this duck is heavier.
    @Override
    public int compareTo(Duck otherDuck) {
        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        } else {
            return 1;
        }
    }
}
