package Conditional_statements;

import java.util.Scanner;

public class If_statement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int x= sc.nextInt();
        // if(x%2==0)
        // {
        // System.out.println("The number is even");
        // } 
        // if(x%2!=0)
        // {
        //     System.out.println("The number is odd");
        // }
        if(x%5==0)
        {
            System.out.println("It is divisible by 5");
        }
        else{
            System.out.println("It isn't divisible by 5");
        }
    }
}
