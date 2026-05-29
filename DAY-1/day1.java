// Que.1 Write a program to Calculate sum of first N natural numbers.

import java.util.*;

public class day1 {
  public static void main (String args[ ]){

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter the number");
    int number = sc.nextInt();
     int Sum = 0;

   for(int i = 1 ; i<=number ; i++){
       Sum+=i;
   }

   System.out.println("The sum is : " + Sum);

  }
}




// Que.2 Write a program to Print multiplication table of a given number.

import java.util.*;

public class day1 {
  public static void main (String args[ ]){

    Scanner sc = new Scanner(System.in);                                                                    System.out.println("Enter the number");
    int number = sc.nextInt();

    for(int i =1 ; i<=10; i++){
      int table = number*i;
      System.out.println(number+ "*" + i + "="+ table);
    } 
     
  }
}




// Que.3 Write a program to Find factorial of a number.

import java.util.*;

public class day1 {
  public static void main (String args[ ]){

    Scanner sc = new Scanner(System.in); 
    System.out.println("Enter the number : ");
    int number = sc.nextInt();

    int Factorial = 1 ;

    for(int i =number ; i>=1; i--){
      Factorial*=i ;
    } 

    System.out.println("facorial of " + number + " is : " + Factorial);
      
  }
}




// Que.4 Write a program to Count digits in a number.

import java.util.*;

public class day1 {
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int number = sc.nextInt();

    int count = 0;
    while (number > 0) {
      number /= 10;
      count++;
    }

    System.out.println("Number of digits : " + count);

  }
}