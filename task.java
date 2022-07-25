package planner;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * this is abstract class task
 */
public class task {
    private int id;
    private String authorsName;
    private String taskCreationDate;
    private String taskCreationTime;
    private String deadLine;
    private DateFormat formatDate = new SimpleDateFormat("dd.MM.yyyy");
    private DateFormat formatTime = new SimpleDateFormat("kk:mm:ss");

    public task(int id, String authorsName) {
        this.id = id;
        this.authorsName = authorsName;
        this.taskCreationDate = formatDate.format(new Date());
        this.taskCreationTime = formatTime.format(new Date());
    }

    public void setDeadLine(int year, int month, int day) {
        if (month < 10) {
            this.deadLine = String.format("%d.0%d.%d", day, month, year);
        } else {
            this.deadLine = String.format("%d.%d.%d", day, month, year);
        }
    }

    @Override
    public String toString() {
        return String.format("%d, %s, %s, %s, %s", this.id, this.authorsName, this.taskCreationDate,
                this.taskCreationTime, this.deadLine);
    }
}