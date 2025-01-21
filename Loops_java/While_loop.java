package Loops_java;
import java.util.Scanner;
public class While_loop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int x=sc.nextInt();
        int num=1;
        while(num<=x)
        {
            System.out.println(num);
            num++;
        }
    }  
    
}
