//ques2. write a program to print prime numbers in a range
import java.util.*;
public class ques2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the starting of range = ");
        int start = sc.nextInt();

        System.out.println("enter the ending of range = ");
        int end = sc.nextInt();

        System.out.println("the prime numbers in this range are = ");
        for(int i=start;i<=end;i++){
            int count=0;

            for(int j=2;j<i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==0){
                    System.out.println(i);
            }
        }
    }
}
