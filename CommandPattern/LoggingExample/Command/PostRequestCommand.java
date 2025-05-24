package CommandPattern.LoggingExample.Command;

public class PostRequestCommand implements RequestCommand{
    private String endpoint;
    private String payload;
    
    public PostRequestCommand(String endpoint, String payload) {
        this.endpoint = endpoint;
        this.payload = payload;
    }

    @Override
    public void execute() {
        System.out.println("Handling POST request for: " + endpoint);
        System.out.println("Payload: " + payload);
    }
}
