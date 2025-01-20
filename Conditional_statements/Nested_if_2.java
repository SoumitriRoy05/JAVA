package Conditional_statements;

import java.util.Scanner;

public class Nested_if_2 {
    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in) ;
    System.out.println("Enter a number:");
    int x=sc.nextInt();
    if (x%5==0 || x%3==0)
    {
        if(x%15==0)
        {
            System.out.println("The number is divisible by 3 or 5 but not 15");
        }
        else
        {
            System.out.println("Not matching required conditions");
        }
    }
    else
        {
            System.out.println("Not matching required conditions");
        }
    }
}
