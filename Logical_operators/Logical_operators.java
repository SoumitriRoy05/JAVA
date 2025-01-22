package Logical_operators;
import java.util.Scanner;
public class Logical_operators {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x=sc.nextInt();
        System.out.println("Enter the second number:");
        int y=sc.nextInt();
        System.out.println("Enter the third number:");
        int z=sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println("X is the largest");
        }
        else if(y>x && y>z)
        {
            System.out.println("Y is the largest");
        }
        else
        {
            System.out.println("Z is the largest");
        }
    }
}
