package Experiments_class;

import java.util.Scanner;

public class Exp_1_2_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // with using third variable
        System.out.println("enter the value of a:");
        int a=sc.nextInt();
        System.out.println("enter the value of b:");
        int b=sc.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("After swapping value of a: "  +a);
        System.out.println("After swapping value of b: "  +b);

    }
}
