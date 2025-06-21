package TemplateMethodPattern;

import java.util.Scanner;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding sugar and milk");
    }
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput("Would you like milk and sugar with your coffee (y/n)? ");
        // Convert the answer to lowercase and check if it starts with 'y'
        return answer.toLowerCase().startsWith("y");
    }
    private String getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
