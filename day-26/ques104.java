//ques104. write a program to create quiz application
import java.util.Scanner;

public class ques104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== QUIZ APPLICATION =====");

        // Question 1
        System.out.println("\n1. What is the capital of India?");
        System.out.println("a) Mumbai");
        System.out.println("b) Delhi");
        System.out.println("c) Kolkata");
        System.out.println("d) Chennai");
        System.out.print("Enter your answer: ");
        char ans1 = sc.next().charAt(0);

        if (ans1 == 'b' || ans1 == 'B') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Which language is used for Android development?");
        System.out.println("a) Java");
        System.out.println("b) Python");
        System.out.println("c) C");
        System.out.println("d) HTML");
        System.out.print("Enter your answer: ");
        char ans2 = sc.next().charAt(0);

        if (ans2 == 'a' || ans2 == 'A') {
            score++;
        }

        // Question 3
        System.out.println("\n3. How many bits are there in one byte?");
        System.out.println("a) 4");
        System.out.println("b) 8");
        System.out.println("c) 16");
        System.out.println("d) 32");
        System.out.print("Enter your answer: ");
        char ans3 = sc.next().charAt(0);

        if (ans3 == 'b' || ans3 == 'B') {
            score++;
        }

        // Question 4
        System.out.println("\n4. Which keyword is used to create an object in Java?");
        System.out.println("a) class");
        System.out.println("b) object");
        System.out.println("c) new");
        System.out.println("d) this");
        System.out.print("Enter your answer: ");
        char ans4 = sc.next().charAt(0);

        if (ans4 == 'c' || ans4 == 'C') {
            score++;
        }

        // Question 5
        System.out.println("\n5. Which symbol ends a Java statement?");
        System.out.println("a) :");
        System.out.println("b) ;");
        System.out.println("c) .");
        System.out.println("d) ,");
        System.out.print("Enter your answer: ");
        char ans5 = sc.next().charAt(0);

        if (ans5 == 'b' || ans5 == 'B') {
            score++;
        }

        // Display Result
        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score: " + score + "/5");

        if (score == 5) {
            System.out.println("Excellent!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Better Luck Next Time!");
        }

        sc.close();
    }
}