//ques3. write a program to find GCD of two numbers
import java.util.*;
public class ques3{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int num1 = sc.nextInt();

        System.out.println("enter second number");
        int num2 = sc.nextInt();

        int gcd = 1;

        for(int i=1;i<=num1 && i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }
        System.out.println("the GCD of the given numbers is = "+ gcd);
    }
}