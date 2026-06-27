//ques107. write a program to create salary management system
import java.util.ArrayList;
import java.util.Scanner;

class ques107 {
    private int id;
    private String name;
    private double basicSalary;
    private double bonus;
    private double deduction;

    public ques107(int id, String name, double basicSalary, double bonus, double deduction) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.deduction = deduction;
    }

    public double getNetSalary() {
        return basicSalary + bonus - deduction;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Deduction: " + deduction);
        System.out.println("Net Salary: " + getNetSalary());
        System.out.println("-----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ques107> employees = new ArrayList<>();

        while (true) {
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter ID: ");
                int id = sc.nextInt();
                sc.nextLine();

                System.out.print("Enter Name: ");
                String name = sc.nextLine();

                System.out.print("Enter Basic Salary: ");
                double basicSalary = sc.nextDouble();

                System.out.print("Enter Bonus: ");
                double bonus = sc.nextDouble();

                System.out.print("Enter Deduction: ");
                double deduction = sc.nextDouble();

                employees.add(new ques107(id, name, basicSalary, bonus, deduction));
                System.out.println("Employee added successfully.\n");
            } else if (choice == 2) {
                if (employees.isEmpty()) {
                    System.out.println("No employees found.\n");
                } else {
                    for (ques107 e : employees) {
                        e.display();
                    }
                }
            } else if (choice == 3) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.\n");
            }
        }

        sc.close();
    }
}