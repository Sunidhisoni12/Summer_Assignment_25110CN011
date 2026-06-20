//ques81. write a program to find string length without strlen()

import java.util.*;

public class ques81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int count = 0;

        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }

        System.out.println("Length of string = " + count);
    }
}