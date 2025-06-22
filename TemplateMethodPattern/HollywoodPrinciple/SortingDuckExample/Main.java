package TemplateMethodPattern.HollywoodPrinciple.SortingDuckExample;
import java.util.Arrays;

import TemplateMethodPattern.HollywoodPrinciple.SortingDuckExample.Class.Duck;


public class Main {
    public static void main(String[] args) {
        Duck[] ducks = {
            new Duck("Daffy", 8),
            new Duck("Dewey", 2),
            new Duck("Howard", 7),
            new Duck("Louie", 2),
            new Duck("Donald", 10)
        };

        System.out.println("Before sorting:");
        printDucks(ducks);

        // Sorts the array of ducks using the compareTo method defined in Duck class.
        Arrays.sort(ducks);  // Uses compareTo from Duck

        System.out.println("\nAfter sorting by weight:");
        printDucks(ducks);
    }

    public static void printDucks(Duck[] ducks) {
        for (Duck d : ducks) {
            System.out.println(d);
        }
    }
}
