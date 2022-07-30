package planner;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import planner.task.Priority;

public class planner {

    List<task> tasks = new ArrayList<>();
    PrintWriter pw = null;

    public void addTask(task task) {
        tasks.add(task);
    }

    public void setPriority(int id, Priority priority) {
        for (task task : tasks) {
            if (task.getID() == id) {
                task.setPriority(priority);
                ;
            }
        }
    }

    public void setDeadLine(int id, int year, int month, int day) {
        for (task task : tasks) {
            if (task.getID() == id) {
                task.setDeadLine(year, month, day);
            }
        }
    }

    public void deleteTask(int id) {

        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getID() == id) {
                tasks.remove(i);
            }
        }
    }

    public void printPlanner() {
        try {
            pw = new PrintWriter(new File("planner/Planner.csv"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String columns = "id, author's name, task creation date, task creation time, deadline, priority";

        pw.write(columns + "\n");

        for (task task : tasks) {
            pw.write(task.toString() + "\n");
        }

        pw.close();
    }



}
