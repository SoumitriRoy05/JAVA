package Experiments_class;
import java.util.Scanner;
public class Exp_1_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first value:");
        float x=sc.nextInt();
        System.out.println("Enter the second value:");
        float y=sc.nextInt();
        System.out.println("The Arithmetic operations:");
        System.out.println("x+y: " +(x+y));
        System.out.println("x-y: " +(x-y));
        System.out.println("x*y: " +(x*y));
        System.out.println("x/y: " +(x/y));
    }
}
