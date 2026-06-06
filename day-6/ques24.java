//ques24. write a program to find x^n without pow()
import java.util.*;

public class ques24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * x;
        }

        System.out.println("x^n = " + result);
    }
}