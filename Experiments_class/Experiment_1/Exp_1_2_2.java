package Experiments_class;
import java.util.Scanner;
public class Exp_1_2_2 {
    public static void main(String[] args) {
        //without using third variable
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping value of a: "  +a);
        System.out.println("After swapping value of b: "  +b);
    }
}
