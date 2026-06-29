//ques115. write a program to create menu driven string operations system
import java.util.*;

public class ques115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int choice;
        do {
            System.out.println("\nMenu Driven String Operations");
            System.out.println("1. Find length");
            System.out.println("2. Convert to uppercase");
            System.out.println("3. Convert to lowercase");
            System.out.println("4. Reverse string");
            System.out.println("5. Check palindrome");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Length = " + str.length());
                    break;

                case 2:
                    System.out.println("Uppercase = " + str.toUpperCase());
                    break;

                case 3:
                    System.out.println("Lowercase = " + str.toLowerCase());
                    break;

                case 4:
                    String rev = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        rev += str.charAt(i);
                    }
                    System.out.println("Reverse = " + rev);
                    break;

                case 5:
                    String temp = "";
                    for (int i = str.length() - 1; i >= 0; i--) {
                        temp += str.charAt(i);
                    }
                    if (str.equalsIgnoreCase(temp)) {
                        System.out.println("Palindrome");
                    } else {
                        System.out.println("Not palindrome");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 6);

        sc.close();
    }
}