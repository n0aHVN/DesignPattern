package TemplateMethodPattern.TemplateMethod;

import java.util.Scanner;

public class TeaWithHook extends CaffeineBeverageWithHook {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding lemon");
    }
    @Override
    public boolean customerWantsCondiments() {
        String answer = getUserInput("Would you like lemon with your tea (y/n)? ");
        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        // scanner.close(); // Do NOT close System.in scanner here
        return input;
    }
}
