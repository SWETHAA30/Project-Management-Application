package ProjectManagement;

public class Timeline {

    public static void getDependencies() {
        System.out.println("Dependency details are as follows:");
        System.out.println("Dependency 1: Task A must be completed before Task B.");
        System.out.println("Dependency 2: Task C must be completed before Task D.\n");
    }

    public static void scheduleDetails() {
        System.out.println("The schedule details are:");
        System.out.println("Start Date: January 1, 2024");
        System.out.println("End Date: January 31, 2024");
        System.out.println("Duration: 30 days\n");
    }

    public static void getMilestones() {
        System.out.println("The milestones achieved are:");
        System.out.println("Milestone 1: Task A completed on January 5, 2024");
        System.out.println("Milestone 2: Task B completed on January 10, 2024");
        System.out.println("Milestone 3: Task C completed on January 15, 2024\n");
    }
}
