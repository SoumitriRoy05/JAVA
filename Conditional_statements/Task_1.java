package Conditional_statements;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        if(year%4==0)
        {
            System.out.println("It is a leap year");
        }
        else{
            System.out.println("It isn't a leap year");
        }
    }
}
