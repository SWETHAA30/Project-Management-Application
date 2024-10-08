package ProjectManagement;

import java.util.Scanner;

public class TaskManagement {
    private static  String date = "";
    private static  String deadline = "";
    private static String dueDate = "";
    private static int priority = 3;
    private static Scanner scanner = new Scanner(System.in);

    public static void createTask() {
        System.out.print("Enter Task Name: ");
        String taskName = scanner.nextLine();
        assignDeadline();
        assignDueDate();
        setPriority();
        System.out.println("\nTask Details:");
        System.out.println("Task Name: " + taskName);
        System.out.println("Deadline: " + deadline);
        System.out.println("Due Date: " + dueDate);
        System.out.println("Priority Level: " + priority + "\n");
    }

    private static void assignDueDate() {
        System.out.print("Enter the Due date to be assigned: ");
        dueDate = scanner.nextLine();
    }

    private static void assignDeadline() {
        System.out.print("Enter the Deadline to be assigned: ");
        deadline = scanner.nextLine();
    }

    private static void setPriority() {
        System.out.print("Enter the priority\n1.High   \n2.Medium   \n3.Low: ");
        int choice = Integer.parseInt(scanner.nextLine());
    }
}
