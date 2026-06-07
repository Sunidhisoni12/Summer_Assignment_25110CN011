//ques28. write a program to recursive reverse number
import java.util.*;

public class ques28 {

    public static int reverse = 0;

    static int reverseNumber(int n) {

        if (n == 0) {
            return reverse;
        }

        int digit = n % 10;
        reverse = reverse * 10 + digit;

        return reverseNumber(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = reverseNumber(n);

        System.out.println("Reversed number = " + result);
    }
}