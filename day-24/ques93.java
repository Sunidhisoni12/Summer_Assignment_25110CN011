//ques93. write a program to check string rotation
import java.util.*;

public class ques93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        if (str1.length() != str2.length()) {
            System.out.println("Not a Rotation");
            return;
        }

        String temp = str1 + str1;

        if (temp.contains(str2)) {
            System.out.println("String is a Rotation");
        } else {
            System.out.println("Not a Rotation");
        }
    }
}