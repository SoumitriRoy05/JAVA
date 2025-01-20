package Conditional_statements;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int n=sc.nextInt();
        if(n%5==0 && n%3!=0)
        {
            System.out.println("It is divisible by 5 and not divisible by 3");
        }
        else
        {
            System.out.println("Vice-versa");
        }
    }
}
