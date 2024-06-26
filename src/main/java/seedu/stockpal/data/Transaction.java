package seedu.stockpal.data;

import seedu.stockpal.data.product.Pid;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

//@@author EdmundTangg
public class Transaction {

    private final Integer changeInQuantity;

    private final LocalDateTime time;
    private final Pid pid;


    public Transaction(Pid pid,
                       Integer changeInQuantity,
                       LocalDateTime time
                       ) {
        this.pid = pid;
        this.changeInQuantity = changeInQuantity;
        this.time = time;
    }

    @Override
    public String toString() {
        String separator = "  |  ";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = this.time.format(formatter);

        if (this.changeInQuantity < 0) {
            return (this.pid + separator
                    + "Change in quantity: " + this.changeInQuantity + separator
                    + "Date of outflow: " + formattedDateTime);
        }

        return (this.pid + separator
                + "Change in quantity: " + this.changeInQuantity + separator
                + "Date of inflow: " + formattedDateTime);
    }

    public int getPid() {
        return this.pid.getPid();
    }

    public Integer getChangeInQuantity() {
        return this.changeInQuantity;
    }

    public LocalDateTime getTime() {
        return this.time;
    }
}
