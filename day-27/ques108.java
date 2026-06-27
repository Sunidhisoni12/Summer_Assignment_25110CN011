//ques108. write a program to create marksheet generation system
import java.util.Scanner;

class ques108 {
    private String name;
    private int rollNo;
    private String[] subjects;
    private int[] marks;

    public void getData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        name = sc.nextLine();

        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        subjects = new String[n];
        marks = new int[n];

        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject " + (i + 1) + ": ");
            subjects[i] = sc.nextLine();

            System.out.print("Enter marks for " + subjects[i] + ": ");
            marks[i] = sc.nextInt();
            sc.nextLine();
        }
    }

    public int getTotal() {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    public double getPercentage() {
        return (double) getTotal() / marks.length;
    }

    public void displayMarksheet() {
        System.out.println("\n----- Marksheet -----");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);

        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ": " + marks[i]);
        }

        System.out.println("Total Marks: " + getTotal());
        System.out.println("Percentage: " + getPercentage() + "%");
    }

    public static void main(String[] args) {
        ques108 obj = new ques108();
        obj.getData();
        obj.displayMarksheet();
    }
}