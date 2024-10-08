package ProjectManagement;
import java.util.*;
import java.util.Scanner;

public class ProjectManagement {

    static Scanner scanner=new Scanner(System.in);

    public void adminPanel()  {

        System.out.println("You are in the Admin panel");
        System.out.println("1.Create Project");
        System.out.println("2.Read Contents");
        System.out.println("3.Update the Contents");
        System.out.println("4.Delete the Project");
        int choice=scanner.nextInt();
        switch (choice) {
            case 1:
                Admin.create();
                break;
            case 2:
                Admin.read();
                break;
            case 3:
                Admin.update();
                break;
            case 4:
                Admin.delete();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }

    public void taskManagement() {
        System.out.println("You are in the Task Management");
        System.out.println("Create a Task");
        TaskManagement task=new TaskManagement();
        task.createTask();
    }

    public void projectTimeline() {
        System.out.println("You are in the Project Timeline");
        Timeline.getDependencies();
        Timeline.scheduleDetails();
        Timeline.getMilestones();

    }

    public void resourceManagement() {
        System.out.println("You are in the Resource Management");
        Resources.assignTeamMember();
        Resources.assignEquipment();
        Resources.assignMaterials();
    }
}