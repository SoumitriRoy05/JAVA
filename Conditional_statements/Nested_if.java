package Conditional_statements;
import java.util.Scanner;
public class Nested_if {
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in) ;
    System.out.println("Enter a number:");
    int x=sc.nextInt();
    if (x%5==0)
    {
        if(x%3==0)
        {
            System.out.println("The number is divisible by 3 and 5 both");
        }
        else
        {
            System.out.println("Not divisible");
        }
    }
    else
        {
            System.out.println("Not divisible");
        }
    
   }
}
   

