package commands;

public class ExitCommand implements Command {

    public void execute(String[] args) {
        System.exit(0);
    }

    public String getName() {
        return "exit";
    }

    public String getManual() {
        return "exit";
    }

}