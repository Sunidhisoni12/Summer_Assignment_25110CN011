//ques112. write a program to create contact management system
import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class ques112 {
    static ArrayList<Contact> contacts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> viewContacts();
                case 3 -> searchContact();
                case 4 -> updateContact();
                case 5 -> deleteContact();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }

    static void addContact() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        System.out.print("Enter phone: ");
        String phone = sc.nextLine();
        System.out.print("Enter email: ");
        String email = sc.nextLine();
        contacts.add(new Contact(name, phone, email));
        System.out.println("Contact added successfully.");
    }

    static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println((i + 1) + ". " + contacts.get(i));
        }
    }

    static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();
        boolean found = false;
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.println("Found: " + c);
                found = true;
            }
        }
        if (!found) System.out.println("Contact not found.");
    }

    static void updateContact() {
        System.out.print("Enter name to update: ");
        String name = sc.nextLine();
        for (Contact c : contacts) {
            if (c.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new phone: ");
                c.phone = sc.nextLine();
                System.out.print("Enter new email: ");
                c.email = sc.nextLine();
                System.out.println("Contact updated successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    static void deleteContact() {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).name.equalsIgnoreCase(name)) {
                contacts.remove(i);
                System.out.println("Contact deleted successfully.");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
}