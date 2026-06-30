//ques118. write a program to create mini library system
import java.util.Scanner;

public class ques118 {
    static Scanner sc = new Scanner(System.in);
    static final int MAX = 100;

    static int[] bookIds = new int[MAX];
    static String[] titles = new String[MAX];
    static String[] authors = new String[MAX];
    static boolean[] issued = new boolean[MAX];
    static int count = 0;

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Mini Library System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 6);
    }

    static void addBook() {
        if (count >= MAX) {
            System.out.println("Library is full.");
            return;
        }

        System.out.print("Enter book ID: ");
        bookIds[count] = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter book title: ");
        titles[count] = sc.nextLine();

        System.out.print("Enter author name: ");
        authors[count] = sc.nextLine();

        issued[count] = false;
        count++;

        System.out.println("Book added successfully!");
    }

    static void displayBooks() {
        if (count == 0) {
            System.out.println("No books available.");
            return;
        }

        System.out.println("\n--- Book List ---");
        for (int i = 0; i < count; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.println("ID: " + bookIds[i]);
            System.out.println("Title: " + titles[i]);
            System.out.println("Author: " + authors[i]);
            System.out.println("Status: " + (issued[i] ? "Issued" : "Available"));
        }
    }

    static void searchBook() {
        System.out.print("Enter book ID to search: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        boolean found = false;

        for (int i = 0; i < count; i++) {
            if (bookIds[i] == searchId) {
                System.out.println("\nBook found!");
                System.out.println("ID: " + bookIds[i]);
                System.out.println("Title: " + titles[i]);
                System.out.println("Author: " + authors[i]);
                System.out.println("Status: " + (issued[i] ? "Issued" : "Available"));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    static void issueBook() {
        System.out.print("Enter book ID to issue: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (bookIds[i] == searchId) {
                if (!issued[i]) {
                    issued[i] = true;
                    System.out.println("Book issued successfully!");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }

    static void returnBook() {
        System.out.print("Enter book ID to return: ");
        int searchId = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            if (bookIds[i] == searchId) {
                if (issued[i]) {
                    issued[i] = false;
                    System.out.println("Book returned successfully!");
                } else {
                    System.out.println("This book was not issued.");
                }
                return;
            }
        }

        System.out.println("Book not found.");
    }
}