//ques109. write a program to create library management system
import java.util.ArrayList;
import java.util.Scanner;

class Book {
    int id;
    String title;
    String author;
    boolean issued;

    Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.issued = false;
    }

    public String toString() {
        return "ID: " + id + ", Title: " + title + ", Author: " + author +
               ", Status: " + (issued ? "Issued" : "Available");
    }
}

public class ques109 {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> searchBook();
                case 4 -> issueBook();
                case 5 -> returnBook();
                case 6 -> {
                    System.out.println("Thank you for using Library Management System.");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice.");
            }
        }
    }

    static void addBook() {
        System.out.print("Enter book id: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter author name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("Book added successfully.");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books found.");
            return;
        }
        for (Book b : books) {
            System.out.println(b);
        }
    }

    static void searchBook() {
        System.out.print("Enter book id or title: ");
        String key = sc.nextLine();
        boolean found = false;

        for (Book b : books) {
            if (String.valueOf(b.id).equals(key) || b.title.equalsIgnoreCase(key)) {
                System.out.println("Found: " + b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Book not found.");
        }
    }

    static void issueBook() {
        System.out.print("Enter book id to issue: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Book b : books) {
            if (b.id == id) {
                if (!b.issued) {
                    b.issued = true;
                    System.out.println("Book issued successfully.");
                } else {
                    System.out.println("Book is already issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    static void returnBook() {
        System.out.print("Enter book id to return: ");
        int id = sc.nextInt();
        sc.nextLine();

        for (Book b : books) {
            if (b.id == id) {
                if (b.issued) {
                    b.issued = false;
                    System.out.println("Book returned successfully.");
                } else {
                    System.out.println("Book was not issued.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }
}