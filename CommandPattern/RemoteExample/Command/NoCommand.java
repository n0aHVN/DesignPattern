package CommandPattern.RemoteExample.Command;

// NoCommand (Null Object Pattern)
public class NoCommand implements Command {
    public void execute() {
        System.out.println("No command assigned to this slot");
    }
    @Override
    public void undo() {
        System.out.println("No command assigned to this slot");
    }
}
