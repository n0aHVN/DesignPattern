package Singleton.ChocolateBoiler;

public class ChocolateBoilerExample {
    public static void main(String[] args) {
        Runnable task = () -> {
            ChocolateBoiler boiler = ChocolateBoiler.getInstance();
            boiler.fill();
            boiler.boil();
            boiler.drain();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
    }
}
