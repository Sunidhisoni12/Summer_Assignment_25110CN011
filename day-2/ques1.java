// Que.1 Write a program to Find sum of digits of a number.

import java.util.*;

public class ques1 {

    public static int Sum(int a) {

        int sum = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            sum += lastDigit;
            a /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number : ");
        int a = sc.nextInt();
        int result = Sum(a);
        System.out.println("Sum of the digits is: " + result);
    }

}


