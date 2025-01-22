package Logical_operators;

import java.util.Scanner;

public class Logical_and {
    public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
       System.out.println("Enter a number:");
       int x=sc.nextInt();
       if(x>99 && x<1000)
       {
        System.out.println("This is a 3 digit number");
       } 
       else
       {
        System.out.println("This is not a three digit number");
       }
       }
}
