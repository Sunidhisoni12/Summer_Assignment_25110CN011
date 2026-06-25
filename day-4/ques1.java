// ques1. write a program to generate fibonacci series
import java.util.*;
public class ques1{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int start = 0;
        int current = 1;
        int end = start + current;
        int n = sc.nextInt();
        System.out.println(start);
        System.out.println(current);
        System.out.println(end);

       
        while(end<=n){
            start=current;
            current=end;
            end =start+end;
            System.out.println(end);
        }
    }
}