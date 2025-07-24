package ChainOfResponsibilityPattern;

public class SupportHandler {
    protected SupportHandler next;

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public void handleRequest(String request) {
        if (next != null) {
            next.handleRequest(request);
        } else {
            System.out.println("No handler could process the request: " + request);
        }
    }
}
