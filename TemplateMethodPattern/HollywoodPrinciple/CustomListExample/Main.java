package TemplateMethodPattern.HollywoodPrinciple.CustomListExample;
import java.util.List;

import TemplateMethodPattern.HollywoodPrinciple.CustomListExample.Class.MyStringList;

public class Main {
    public static void main(String[] args) {
        String[] data = {"Apple", "Banana", "Cherry", "Date"};
        List<String> list = new MyStringList(data);

        System.out.println("Original list:");
        for (String s : list) {
            System.out.println(s);
        }
        // This is a template method in action
        list.set(1, "Blueberry");  // Modifies "Banana" to "Blueberry"

        System.out.println("\nAfter modification:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("\nSublist (index 1 to 3):");
        List<String> sub = list.subList(1, 3);  // Inherited via template method
        for (String s : sub) {
            System.out.println(s);
        }
    }
}
