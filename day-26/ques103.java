//ques103. write a program to create ATM simulation
import java.util.Scanner;

public class ques103 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = 10000;
        int choice, amount;

        do {
            System.out.println("\n===== ATM SIMULATION =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    amount = sc.nextInt();
                    balance += amount;
                    System.out.println("Deposit Successful!");
                    System.out.println("Updated Balance: ₹" + balance);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    amount = sc.nextInt();

                    if (amount <= balance) {
                        balance -= amount;
                        System.out.println("Withdrawal Successful!");
                        System.out.println("Remaining Balance: ₹" + balance);
                    } else {
                        System.out.println("Insufficient Balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;

                default:
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}