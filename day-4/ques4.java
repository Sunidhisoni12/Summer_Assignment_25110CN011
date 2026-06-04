//ques4. write a program to print armstrong numbers in a rangeimport java.util.Scanner;
import java.util.*;
public class ques4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter ending number: ");
        int end = sc.nextInt();

        System.out.println("Armstrong numbers are:");

        for (int i = start; i <= end; i++) {

            int num = i;
            int original = i;
            int sum = 0;

            while (num > 0) {

                int digit = num % 10;

                sum = sum + (digit * digit * digit);

                num = num / 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}