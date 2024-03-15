package seedu.stockpal.ui;

import seedu.stockpal.common.Messages;

import java.util.NoSuchElementException;
import java.util.Scanner;

public final class Ui {
    private static final Scanner scanner = new Scanner(System.in);
    private static final String LINE_SEPARATOR = System.lineSeparator();

    public static String getUserInput() throws NoSuchElementException {
        String input = "";
        try {
            input = scanner.nextLine();
        } catch (NoSuchElementException exception) {
            System.out.println("error");
            System.exit(0);
        }
        return input;
    }

    /**
     * Outputs the list of messages, and replace line-separators
     * with platform independent line-separator.
     *
     * @param messages List of messages to output.
     */
    public static void printToScreen(String... messages) {
        for (String message : messages) {
            System.out.println(message.replace("\n", LINE_SEPARATOR));
        }
    }

    public static void printWelcomeMessage() {
        printToScreen(Messages.MESSAGE_WELCOME);
    }

    public static void printGoodbyeMessage() {
        printToScreen(Messages.MESSAGE_GOODBYE);
    }
}