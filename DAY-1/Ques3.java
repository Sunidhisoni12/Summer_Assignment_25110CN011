// Que.3 Write a program to Find factorial of a number.

import java.util.*;

public class Ques3 {
  public static void main (String args[ ]){

    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the number : ");
    int num = sc.nextInt();

    int Factorial = 1 ;

    for(int i =num ; i>=1; i--){
      Factorial*=i ;
    } 

    System.out.println("facorial of " + num + " is : " + Factorial);
      
  }
}