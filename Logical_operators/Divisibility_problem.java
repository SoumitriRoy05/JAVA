package Logical_operators;
import java.util.Scanner;
public class Divisibility_problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer");
        int n=sc.nextInt();
        if(n%5==0 && n%3==0)
        {
            System.out.println("It is divisible by both 5 and 3");
        }
        else
        {
            System.out.println("Not divisible by both");
        }
    }
}
