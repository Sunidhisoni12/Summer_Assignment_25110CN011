// Que.1 Write a program to Find sum of digits of a number.

import java.util.*;

public class day2 {

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




// Que.2 Write a program to Reverse a number.

import java.util.*;

public class day2 {

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




// Que.3 Write a program to Find product of digits.

public class day2 {

    public static void Palindrome(int a) {
        int temp = a;
        int reverse = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = reverse * 10 + lastDigit;
            temp /= 10;
        }

        if (reverse == a) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {

        Palindrome(123);
        Palindrome(121);
    }
}




// Que.4 Write a program to Check whether a number is palindrome.

import java.util.*;

public class day2 {

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