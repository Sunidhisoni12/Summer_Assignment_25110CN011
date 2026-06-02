// Que.2 Write a program to Reverse a number.

import java.util.*;

public class ques2 {

    public static int reverse(int a) {

        int reverse = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            reverse = reverse * 10 + lastDigit;
            a /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number : ");
        int a = sc.nextInt();
        int result = reverse(a);
        System.out.println("Reverse of a number is: " + result);
    }

}
