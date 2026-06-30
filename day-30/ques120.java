//ques120. write a program to develop complete mini project using arrays,strings and function
import java.util.Scanner;

public class ques120 {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;

    static String[] names = new String[MAX];
    static int[][] marks = new int[MAX][5];
    static float[] averages = new float[MAX];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Student Record Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    displayStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);
    }

    static void addStudent() {
        if (count >= MAX) {
            System.out.println("Student list is full.");
            return;
        }

        System.out.print("Enter student name: ");
        names[count] = sc.nextLine();

        System.out.println("Enter 5 subject marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[count][i] = sc.nextInt();
        }
        sc.nextLine();

        averages[count] = calculateAverage(marks[count], 5);
        count++;

        System.out.println("Student added successfully!");
    }

    static void displayStudents() {
        if (count == 0) {
            System.out.println("No student records available.");
            return;
        }

        System.out.println("\n--- Student Records ---");
        for (int i = 0; i < count; i++) {
            System.out.println("\nStudent " + (i + 1));
            System.out.println("Name: " + names[i]);
            System.out.print("Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(marks[i][j] + " ");
            }
            System.out.println("\nAverage: " + averages[i]);
        }
    }

    static void searchStudent() {
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (names[i].equalsIgnoreCase(searchName)) {
                System.out.println("\nStudent found!");
                System.out.println("Name: " + names[i]);
                System.out.print("Marks: ");
                for (int j = 0; j < 5; j++) {
                    System.out.print(marks[i][j] + " ");
                }
                System.out.println("\nAverage: " + averages[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    static float calculateAverage(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (float) sum / n;
    }
}