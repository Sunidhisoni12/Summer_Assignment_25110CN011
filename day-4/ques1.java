// ques1. write a program to generate fibonacci series
import java.util.*;
public class ques1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int start = 0;
        int current = 1;

        System.out.println("the fibonnaci series is = ");
        System.out.println(start);
        System.out.println(current);

        int end=start+current;
        System.out.println(end);

        while(start<=100){
            System.out.println(start);
            start=current;
            current=end;
            end=start+current;
        }
    }
}            