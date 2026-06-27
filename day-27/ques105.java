//ques105. write a program to create student record management system
import java.util.ArrayList;
import java.util.Scanner;

class ques105 {
    int id;
    String name;
    int age;
    String course;

    ques105(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ques105> students = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Age: ");
                int age = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Course: ");
                String course = sc.nextLine();

                students.add(new ques105(id, name, age, course));
                System.out.println("Student added successfully.\n");
            } else if (choice == 2) {
                if (students.isEmpty()) {
                    System.out.println("No student records found.\n");
                } else {
                    for (ques105 s : students) {
                        s.display();
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int searchId = sc.nextInt();
                boolean found = false;

                for (ques105 s : students) {
                    if (s.id == searchId) {
                        s.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student not found.\n");
                }
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.\n");
            }
        }

        sc.close();
    }
}