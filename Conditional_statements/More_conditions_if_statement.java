package Conditional_statements;
import java.util.Scanner;
public class More_conditions_if_statement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        if(x%15!=0 && (x%5==0 || x%3==0))
        {
        System.out.println("It is divisible by 5 or 3 and not divisible by 15");
        }
        else
        {
            System.out.println("Not satisfying conditions");
        }
    }
}
