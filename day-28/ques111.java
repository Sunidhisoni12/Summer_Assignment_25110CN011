//ques111. write a program to create ticket booking system
import java.util.Scanner;

public class ques111 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] seats = {"Available", "Available", "Available", "Available", "Available"};

        while (true) {
            System.out.println("\nTicket Booking System");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. Check Ticket Status");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    boolean booked = false;
                    for (int i = 0; i < seats.length; i++) {
                        if (seats[i].equals("Available")) {
                            seats[i] = "Booked";
                            System.out.println("Seat " + (i + 1) + " is booked.");
                            booked = true;
                            break;
                        }
                    }
                    if (!booked) {
                        System.out.println("No seats available.");
                    }
                    break;

                case 2:
                    System.out.print("Enter seat number to cancel (1-5): ");
                    int seatNo = sc.nextInt();
                    if (seatNo >= 1 && seatNo <= 5) {
                        if (seats[seatNo - 1].equals("Booked")) {
                            seats[seatNo - 1] = "Available";
                            System.out.println("Seat " + seatNo + " is cancelled.");
                        } else {
                            System.out.println("Seat is already available.");
                        }
                    } else {
                        System.out.println("Invalid seat number.");
                    }
                    break;

                case 3:
                    for (int i = 0; i < seats.length; i++) {
                        System.out.println("Seat " + (i + 1) + ": " + seats[i]);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using Ticket Booking System.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}