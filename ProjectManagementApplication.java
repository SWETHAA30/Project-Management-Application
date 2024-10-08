package ProjectManagement;

import ProjectManagement.ProjectManagement;

import java.util.Scanner;

public class ProjectManagementApplication {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ProjectManagement projectManagement = new ProjectManagement();
        Admin.createUser();
        int choice;
        while (true) {
            System.out.println("Select Your Choice");
            System.out.println("1.Admin panel");
            System.out.println("2.Task Management");
            System.out.println("3.Project Timeline");
            System.out.println("4.Resource Management");
            System.out.println("5.Exit");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    projectManagement.adminPanel();
                    break;
                case 2:
                    projectManagement.taskManagement();
                    break;
                case 3:
                    projectManagement.projectTimeline();
                    break;
                case 4:
                    projectManagement.resourceManagement();
                    break;
                case 5:
                    System.out.println("Exiting the application...");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }
}
