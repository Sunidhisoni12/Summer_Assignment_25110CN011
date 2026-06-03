//ques1. write a program to check whether a number is prime 
import java.util.*;
public class ques1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number = ");
        int number=sc.nextInt();
        int count=0;

        for(int i=2;i<number;i++){
            if(number%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("The number is not prime");
        }
        else{
            System.out.println("The number is prime");
        }
    }
}