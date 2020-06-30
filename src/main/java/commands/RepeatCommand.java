package commands;

import java.util.Scanner;

/**
 * RepeatCommand
 * By: Olivier Brassard
 * Project : testCLI
 * Date: 2020-06-29
 */
public class RepeatCommand implements Command {

    @Override
    public void execute(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un chiffre :");
        int number = scanner.nextInt();

        if (number < 0) {
            throw new UnsupportedOperationException("Le nombre doit être >= 0 ");
        }

        System.out.println("Entrez un mot :");
        String text = scanner.next();

        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getManual() {
        return null;
    }
}
