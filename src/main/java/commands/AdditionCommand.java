package commands;

public class AdditionCommand implements Command {

    public void execute(String[] args) {
        if (args.length < 2) {
            throw new UnsupportedOperationException("The add command require at least 2 args");
        }

        int sum = 0;

        for (String num: args) {
            try {
                int value = Integer.parseInt(num);
                sum += value;
            } catch (NumberFormatException e) {
                throw new UnsupportedOperationException("Arguments must be integers");
            }
        }

        System.out.println("The result is " + sum);
    }

    public String getName() {
        return "add";
    }

    public String getManual() {
        return "add <int 1> <int 2> <int 3> ...";
    }

}