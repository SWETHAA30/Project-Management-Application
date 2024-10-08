package ProjectManagement;

import java.util.Scanner;

public class Admin {
    static Scanner scanner=new Scanner(System.in);


    public static void createUser() {
        System.out.print("User ID: ");
        scanner.next();
        System.out.print("Username: ");
        String b=scanner.next();
        System.out.print("Password: ");
        scanner.next();
        System.out.println("\nUSER "+b+" HAS BEEN CREATED SUCCESSFULLY");
    }
    public static void create() {
        System.out.print("Project ID: ");
        scanner.next();
        System.out.print("Project Name: ");
        scanner.next();
        System.out.println("\nUSER CREATED SUCCESSFULLY");
    }

    public static void read() {
        System.out.print("Enter Project ID: ");
        scanner.next();
        System.out.println("The Contents are....");
        System.out.println("Project Name : Project Application");
        System.out.println("Project Typle : Web Application , OOP , Structured");
        System.out.println("Project Contents are read");
    }

    public static void update() {
        System.out.print("Enter Project ID: ");
        String x=scanner.next();
        System.out.println("Project "+x+"has been updates successfully");
    }

    public static void delete() {
        System.out.print("Enter Project ID : ");
        String x= scanner.next();
        System.out.println("Project "+x+"has been deleted successfully");
    }
}
