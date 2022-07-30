package planner;
import planner.task.Priority;

// import java.util.ArrayList;
// import java.util.List;

public class program {
    public static void main(String[] args) {
        planner dayPlanner = new planner();
        dayPlanner.addTask(new task(1, "Max"));
        dayPlanner.addTask(new task(2, "Vikki"));
        dayPlanner.addTask(new task(3, "Albert"));

        dayPlanner.printPlanner();

        dayPlanner.setPriority(1, Priority.HIGH);
        dayPlanner.setDeadLine(2, 2022, 11, 27);
        
        dayPlanner.printPlanner();

    }
}
