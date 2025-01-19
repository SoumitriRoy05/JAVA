package Java_basics;

import java.util.Scanner;

public class Modulo_operator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        int remainder=a%b;
        System.out.println("The remainder: "+remainder);
    }
}
