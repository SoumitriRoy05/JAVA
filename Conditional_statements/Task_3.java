package Conditional_statements;
import java.util.Scanner;
public class Task_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of rectangle:");
        double length=sc.nextInt();
        System.out.println("Enter the breadth of rectangle:");
        double breadth=sc.nextInt();
        double area=length*breadth;
        double perimeter=2*(length+breadth);
        if(area>perimeter)
        {
            System.out.println("Area of rectangle is greater than its perimeter");
        }
        else if(area<perimeter){
            System.out.println("Perimeter of rectangle is greater than its area");
        }
        else{
            System.out.println("Both area and perimeter are same");
        }
    }
}
