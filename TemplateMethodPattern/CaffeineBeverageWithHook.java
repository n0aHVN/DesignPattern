package TemplateMethodPattern;

public abstract class CaffeineBeverageWithHook {

    // Template method
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) { // This is the hook
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // This is the hook
    // The hook is a method that can be overridden by subclasses
    // to change the behavior of the template method
    boolean customerWantsCondiments() {
        return true;
    }
}
