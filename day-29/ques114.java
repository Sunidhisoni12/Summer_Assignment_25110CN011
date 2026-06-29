//ques114. write a program to create menu driven array operation system
import java.util.*;

public class ques114 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int choice;
        do {
            System.out.println("\nMenu Driven Array Operations");
            System.out.println("1. Display array");
            System.out.println("2. Find sum");
            System.out.println("3. Search element");
            System.out.println("4. Reverse array");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Array elements:");
                    for (int x : nums) {
                        System.out.print(x + " ");
                    }
                    System.out.println();
                    break;

                case 2:
                    int sum = 0;
                    for (int x : nums) {
                        sum += x;
                    }
                    System.out.println("Sum = " + sum);
                    break;

                case 3:
                    System.out.print("Enter element to search: ");
                    int key = sc.nextInt();
                    boolean found = false;
                    for (int i = 0; i < nums.length; i++) {
                        if (nums[i] == key) {
                            found = true;
                            System.out.println("Element found at index " + i);
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Element not found");
                    }
                    break;

                case 4:
                    System.out.println("Reversed array:");
                    for (int i = nums.length - 1; i >= 0; i--) {
                        System.out.print(nums[i] + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 5);

        sc.close();
    }
}