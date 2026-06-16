//ques61. write a program to find missing number in an array
import java.util.*;

public class ques61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array (n-1): ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int expectedSum = (n + 1) * (n + 2) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += arr[i];
        }

        int missingNumber = expectedSum - actualSum;

        System.out.println("Missing number = " + missingNumber);
    }
}