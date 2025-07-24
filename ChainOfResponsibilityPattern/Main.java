package ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler basic = new BasicSupport();
        SupportHandler manager = new ManagerSupport();
        SupportHandler director = new DirectorSupport();

        // Set up the chain: basic → manager → director
        basic.setNext(manager);
        manager.setNext(director);

        // Send some requests
        basic.handleRequest("basic");     // Handled by BasicSupport
        basic.handleRequest("manager");   // Handled by ManagerSupport
        basic.handleRequest("director");  // Handled by DirectorSupport
        basic.handleRequest("ceo");       // No handler could process the request
    }
}
