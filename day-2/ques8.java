// Que.8 Write a program to Check whether a number is palindrome.

import java.util.*;

public class ques8 {

    public static int product(int a) {

        int product = 1;
        while (a > 0) {
            int lastDigit = a % 10;
            product *= lastDigit;
            a /= 10;
        }
        return product;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  number : ");
        int a = sc.nextInt();
        int result = product(a);
        System.out.println("product of a number is: " + result);
    }

}