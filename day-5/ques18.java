//ques18. write a program to check strong number
import java.util.*;

public class ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int temp = num;
        int sum = 0;

        while(temp > 0) {
            int digit = temp % 10;

            int fact = 1;
            for(int i = 1; i <= digit; i++) {
                fact = fact * i;
            }

            sum = sum + fact;
            temp = temp / 10;
        }

        if(sum == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is not a Strong Number");
        }
    }
}