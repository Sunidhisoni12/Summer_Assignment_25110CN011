// Que.5  Write a program to Find sum of digits of a number.
import java.util.*;

public class ques5 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num1=num;
        int sum=0;
        while(num>0){
            num1=num%10;
            sum+=num1;
            num=num/10;
        }
        System.out.println("the sum of the digits of number num is = "+sum);
    }
}
