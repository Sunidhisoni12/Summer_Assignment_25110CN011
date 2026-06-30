//ques119. write a program to create mini employee management system
import java.util.Scanner;

public class ques119 {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;

    static int[] ids = new int[MAX];
    static String[] names = new String[MAX];
    static String[] departments = new String[MAX];
    static double[] salaries = new double[MAX];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    displayEmployees();
                    break;
                case 3:
                    searchEmployee();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }

    static void addEmployee() {
        if (count >= MAX) {
            System.out.println("Employee list is full.");
            return;
        }

        System.out.print("Enter employee ID: ");
        ids[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter employee name: ");
        names[count] = sc.nextLine();

        System.out.print("Enter department: ");
        departments[count] = sc.nextLine();

        System.out.print("Enter salary: ");
        salaries[count] = sc.nextDouble();
        sc.nextLine();

        count++;
        System.out.println("Employee added successfully!");
    }

    static void displayEmployees() {
        if (count == 0) {
            System.out.println("No employee records available.");
            return;
        }

        System.out.println("\n--- Employee Records ---");
        for (int i = 0; i < count; i++) {
            System.out.println("\nEmployee " + (i + 1));
            System.out.println("ID: " + ids[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Department: " + departments[i]);
            System.out.println("Salary: " + salaries[i]);
        }
    }

    static void searchEmployee() {
        System.out.print("Enter employee ID to search: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (ids[i] == searchId) {
                System.out.println("\nEmployee found!");
                System.out.println("ID: " + ids[i]);
                System.out.println("Name: " + names[i]);
                System.out.println("Department: " + departments[i]);
                System.out.println("Salary: " + salaries[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Employee not found.");
        }
    }
}