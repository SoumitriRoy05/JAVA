package Loops_java;

import java.util.Scanner;

public class Do_while_loop2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        do{
            sum+=num;
            num=sc.nextInt();
        }
        while(num!=-1);
    }
}
