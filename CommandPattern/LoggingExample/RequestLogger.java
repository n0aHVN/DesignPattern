package CommandPattern.LoggingExample;

import java.util.ArrayList;
import java.util.List;

import CommandPattern.LoggingExample.Command.RequestCommand;

public class RequestLogger {
    private List<RequestCommand> commandHistory = new ArrayList<>();

    public void logAndExecute(RequestCommand command) {
        commandHistory.add(command); // log it
        command.execute();           // run it
    }

    public void replayRequests() {
        System.out.println("\nReplaying all requests:");
        for (RequestCommand cmd : commandHistory) {
            cmd.execute();
        }
    }
}
