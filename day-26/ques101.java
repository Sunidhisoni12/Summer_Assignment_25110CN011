//ques101. write a program to create number guessing game
import java.util.Scanner;
import java.util.Random;

public class ques101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;

        System.out.println("===== NUMBER GUESSING GAME =====");
        System.out.println("I have selected a number between 1 and 100.");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();

            if (guess < number) {
                System.out.println("Too Low! Try Again.");
            } else if (guess > number) {
                System.out.println("Too High! Try Again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number.");
            }

        } while (guess != number);

        sc.close();
    }
}