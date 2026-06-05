//ques20. write a program to find largest common factor
import java.util.*;

public class ques20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int hcf = 1;

        // loop up to smaller number
        int min = (a < b) ? a : b;

        for(int i = 1; i <= min; i++) {
            if(a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }

        System.out.println("HCF (GCD) of " + a + " and " + b + " is: " + hcf);
    }
}