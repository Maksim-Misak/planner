package planner;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class planner {

    List<task> tasks = new ArrayList<>();

    public void addTask(task task) {
        tasks.add(task);
    }

    public void printPlanner() {
        PrintWriter pw = null;
        try {
            pw = new PrintWriter(new File("Planner.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String columns = "id, author's name, task creation date, task creation time, deadline";

        pw.write(columns + "\n");

        for (task task : tasks) {
            pw.write(task.toString() + "\n");
        }

        pw.close();
    }

}
