package seedu.stockpal.commands;

import seedu.stockpal.common.Messages;
import seedu.stockpal.exceptions.StockPalException;


import static seedu.stockpal.ui.Ui.printToScreen;

public class HelpCommand extends Command {
    public static final String COMMAND_KEYWORD = "help";
    public static final String COMMAND_USAGE = COMMAND_KEYWORD + ": ";

    @Override
    public void execute() throws StockPalException {
        printToScreen(Messages.HORIZONTAL_LINE
                + "\n" + NewCommand.COMMAND_USAGE
                + "\n\n" + EditCommand.COMMAND_USAGE
                + "\n\n" + DeleteCommand.COMMAND_USAGE
                + "\n\n" + InflowCommand.COMMAND_USAGE
                + "\n\n" + OutflowCommand.COMMAND_USAGE
                + "\n\n" + ListCommand.COMMAND_USAGE
                + "\n\n" + ExitCommand.COMMAND_USAGE
                + "\n" + Messages.HORIZONTAL_LINE

        );
    }
}
