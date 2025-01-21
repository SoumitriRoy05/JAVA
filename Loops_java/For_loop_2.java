package Loops_java;

import java.util.Scanner;

public class For_loop_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        for(int num=n;num>=1;num--)
        {
            System.out.println(num);
        }
    }
}
