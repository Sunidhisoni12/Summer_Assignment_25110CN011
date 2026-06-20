//ques84. write a program to convert lowercase letter into uppercase

import java.util.*;

public class ques84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a lowercase letter: ");
        char ch = sc.next().charAt(0);

        char upper = Character.toUpperCase(ch);

        System.out.println("Uppercase letter: " + upper);
    }
}