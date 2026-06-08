// Que.7 Write a program to Find product of digits.

public class ques7 {

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


