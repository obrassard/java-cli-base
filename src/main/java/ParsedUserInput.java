/**
 * ParsedUserInput
 * By: Olivier Brassard
 * Project : testCLI
 * Date: 2020-06-29
 */
public class ParsedUserInput {
    public String command;
    public String[] args;

    public ParsedUserInput(String command, String[] args ) {
        this.command = command;
        this.args = args;
    }
}
