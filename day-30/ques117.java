//ques117.write a program to create student record system using arrays and string
import java.util.Scanner;

public class ques117 {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;

    static int[] roll = new int[MAX];
    static String[] names = new String[MAX];
    static String[] courses = new String[MAX];
    static int[] ages = new int[MAX];
    static float[] marks = new float[MAX];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Student Record System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
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
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        if (count >= MAX) {
            System.out.println("Student list is full.");
            return;
        }

        System.out.print("Enter roll number: ");
        roll[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student name: ");
        names[count] = sc.nextLine();

        System.out.print("Enter course: ");
        courses[count] = sc.nextLine();

        System.out.print("Enter age: ");
        ages[count] = sc.nextInt();

        System.out.print("Enter marks: ");
        marks[count] = sc.nextFloat();
        sc.nextLine();

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
            System.out.println("Roll No: " + roll[i]);
            System.out.println("Name: " + names[i]);
            System.out.println("Course: " + courses[i]);
            System.out.println("Age: " + ages[i]);
            System.out.println("Marks: " + marks[i]);
        }
    }

    static void searchStudent() {
        System.out.print("Enter roll number to search: ");
        int searchRoll = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (roll[i] == searchRoll) {
                System.out.println("\nStudent found!");
                System.out.println("Roll No: " + roll[i]);
                System.out.println("Name: " + names[i]);
                System.out.println("Course: " + courses[i]);
                System.out.println("Age: " + ages[i]);
                System.out.println("Marks: " + marks[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter roll number to delete: ");
        int searchRoll = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (roll[i] == searchRoll) {
                for (int j = i; j < count - 1; j++) {
                    roll[j] = roll[j + 1];
                    names[j] = names[j + 1];
                    courses[j] = courses[j + 1];
                    ages[j] = ages[j + 1];
                    marks[j] = marks[j + 1];
                }
                count--;
                found = true;
                System.out.println("Student deleted successfully!");
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }
}