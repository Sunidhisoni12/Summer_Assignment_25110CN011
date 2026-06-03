//ques4. write a program to find LCM of two numbers
import java.util.*;
public class ques4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter first number");
        int num1 = sc.nextInt();

        System.out.println("enter second number");
        int num2 = sc.nextInt();

        for(int lcm = 1; ; lcm++) {

            if(lcm % num1 == 0 && lcm % num2 == 0) {
                System.out.println("LCM of the given numbers = " + lcm);
                break;
            }
        }        
    }
}       
         