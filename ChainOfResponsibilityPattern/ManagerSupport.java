package ChainOfResponsibilityPattern;

public class ManagerSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("manager")) {
            System.out.println("ManagerSupport handled the request.");
        } else {
            super.handleRequest(request);
        }
    }
}
