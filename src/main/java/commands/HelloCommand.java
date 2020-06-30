package commands;

public class HelloCommand implements Command {


    public void execute(String[] args) {
        if (args.length < 1) throw new UnsupportedOperationException("The Hello command require one argument");
        System.out.println(String.format("Hello %s, how are you today ?", args[0]));
    }

    public String getName() {
        return "hello";
    }

    public String getManual() {
        return "hello <name>";
    }

}