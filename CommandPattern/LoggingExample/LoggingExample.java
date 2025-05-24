package CommandPattern.LoggingExample;

import CommandPattern.LoggingExample.Command.GetRequestCommand;
import CommandPattern.LoggingExample.Command.PostRequestCommand;
import CommandPattern.LoggingExample.Command.RequestCommand;

public class LoggingExample {
    public static void main(String[] args) {
        RequestLogger logger = new RequestLogger();

        RequestCommand getCmd = new GetRequestCommand("/api/users");
        RequestCommand postCmd = new PostRequestCommand("/api/users", "{\"name\":\"Alice\"}");

        logger.logAndExecute(getCmd);
        logger.logAndExecute(postCmd);

        // Later: replay for debugging
        logger.replayRequests();
    }
}
