package planner;

// import java.util.ArrayList;
// import java.util.List;

public class program {
    public static void main(String[] args) {
        planner dayPlanner = new planner();
        dayPlanner.addTask(new task(1, "Max"));
        dayPlanner.addTask(new task(2, "Vikki"));
        dayPlanner.addTask(new task(3, "Albert"));

        dayPlanner.printPlanner();

        // dayPlanner.printPlanner(taskList);

    }
}
