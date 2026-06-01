// Que.1 Write a program to Calculate sum of first N natural numbers.

import java.util.*;

public class Ques1 {
  public static void main (String args[ ]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number");
    int num = sc.nextInt();
     int Sum = 0;

   for(int i = 1 ; i<=num ; i++){
       Sum+=i;
   }

   System.out.println("The sum is : " + Sum);

  }
}