
import commands.*;

import java.util.*;

public class CliService {

    private Map<String, Command> commands;
    private Scanner cliScanner;

    public CliService() {
        commands = new HashMap<>();
        cliScanner = new Scanner(System.in);
        initCommands();
    }

    private void initCommands() {
        commands.put("hello", new HelloCommand());
        commands.put("add", new AdditionCommand());
        commands.put("exit", new ExitCommand());
        commands.put("repeat", new RepeatCommand());
    }

    private void executeCommand(String command, String[] args) {
        if (commands.containsKey(command)) {
            Command selectedCommand = commands.get(command);
            System.out.println();
            selectedCommand.execute(args);
            System.out.println();
        } else {
            throw new UnsupportedOperationException(String.format("La commande %s n'est pas une commande valide.", command));
        }
    }

    private void greet() {
        System.out.println("Welcome to my CLI experience");
    }

    private String prompt() {
        System.out.println("\nEntrez une commande >");
        return cliScanner.nextLine();
    }

    private ParsedUserInput parseInput(String input) {

        String[] split = input.trim().split(" ");

        if (split.length == 0 || split[0].equals("")) {
            throw new UnsupportedOperationException("Veuillez entrer un commande valide");
        }

        String[] args;
        if (split.length > 1) {
            args = Arrays.copyOfRange(split, 1, split.length);
        } else {
            args = new String[0];
        }

        return new ParsedUserInput(split[0].toLowerCase(), args);
    }

    public void run() {
        greet();
        while (true) {
            try {
                String input = prompt();
                ParsedUserInput parsedInput = parseInput(input);
                executeCommand(parsedInput.command, parsedInput.args);
            } catch (UnsupportedOperationException e) {
                System.out.println(e.getMessage());
            }
        }
    }

}