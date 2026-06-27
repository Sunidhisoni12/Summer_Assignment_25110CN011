//ques106. write a program to create employee management system
import java.util.ArrayList;
import java.util.Scanner;

class ques106 {
    int id;
    String name;
    String department;
    double salary;

    ques106(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ques106> employees = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee by ID");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Department: ");
                String department = sc.nextLine();

                System.out.print("Enter Salary: ");
                double salary = sc.nextDouble();

                employees.add(new ques106(id, name, department, salary));
                System.out.println("Employee added successfully.\n");
            } else if (choice == 2) {
                if (employees.isEmpty()) {
                    System.out.println("No employees found.\n");
                } else {
                    for (ques106 e : employees) {
                        e.display();
                    }
                }
            } else if (choice == 3) {
                System.out.print("Enter ID to search: ");
                int searchId = sc.nextInt();
                boolean found = false;

                for (ques106 e : employees) {
                    if (e.id == searchId) {
                        e.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Employee not found.\n");
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