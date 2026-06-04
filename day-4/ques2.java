// ques2. write a program to find nth fibonacci term
import java.util.*;
public class ques2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int start = 0;
        int current = 1;
        int end = 0;

        if (n == 0) {
            System.out.println("Nth Fibonacci term = " + start);
        }

        else if (n == 1) {
            System.out.println("Nth Fibonacci term = " + current);
        }

        else {
            for (int i = 2; i <= n; i++) {
                end = start + current;
                start = current;
                current = end;
            }

            System.out.println("Nth Fibonacci term = " + current);
        }
    }
}