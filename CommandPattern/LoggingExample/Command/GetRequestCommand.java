package CommandPattern.LoggingExample.Command;

public class GetRequestCommand implements RequestCommand {
    private String endpoint;

    public GetRequestCommand(String endpoint) {
        this.endpoint = endpoint;
    }
    @Override
    public void execute() {
        System.out.println("Handling GET request for: " + endpoint);
    }
}
