// Que.2 Write a program to Print multiplication table of a given number.

import java.util.*;

public class Ques2 {
  public static void main (String args[ ]){

    Scanner sc = new Scanner(System.in);                                                                    System.out.println("Enter the number");
    int num = sc.nextInt();

    for(int i =1 ; i<=10; i++){
      int table = num*i;
      System.out.println(num+ "*" + i + "="+ table);
    } 
     
  }
}
