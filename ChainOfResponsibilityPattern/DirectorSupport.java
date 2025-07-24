package ChainOfResponsibilityPattern;

public class DirectorSupport extends SupportHandler {
    @Override
    public void handleRequest(String request) {
        if (request.equalsIgnoreCase("director")) {
            System.out.println("DirectorSupport handled the request.");
        } else {
            super.handleRequest(request);
        }
    }
}
