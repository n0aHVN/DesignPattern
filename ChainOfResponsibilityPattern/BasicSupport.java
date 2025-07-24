package ChainOfResponsibilityPattern;

public class BasicSupport extends SupportHandler {
     @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("basic")) {
            System.out.println("BasicSupport handled the request.");
        } else {
            super.handleRequest(request);
        }
    }
}
