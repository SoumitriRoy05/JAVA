package Conditional_statements;
import java.util.Scanner;
public class Triangle_problem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side of a triangle:");
        int x=sc.nextInt();
        System.out.println("Enter the second side of a triangle:");
        int y=sc.nextInt();
        System.out.println("Enter the third side of a triangle:");
        int z=sc.nextInt();
        if(x+y>z && y+z>x && x+z>y )
        {
        System.out.println("It is a valid triangle");
        }
        else
        {
            System.out.println("It is not a valid triangle");
        }
    }
}
