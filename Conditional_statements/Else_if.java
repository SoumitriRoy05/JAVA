package Conditional_statements;
import java.util.Scanner;
public class Else_if {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the percentage of a student:");
        double percentage=sc.nextInt();
        if(90<percentage)
        {
            System.out.println("Excellent");
        }
        else if(80<percentage)
        {
            System.out.println("Very Good");
        }
        else if(70<percentage)
        {
            System.out.println("Good");
        }
        else if(60<percentage)
        {
            System.out.println("Can do better");
        }
        else if(50<percentage)
        {
            System.out.println("Average");
        }
        else if(40<percentage)
        {
            System.out.println("Below Average");
        }
        else{
            System.out.println("Fail");
        }
    }
}
