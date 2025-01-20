package Conditional_statements;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an integer:");
        int x=sc.nextInt();
        if(x<0){
            x=x*(-1);
        }
        System.out.println("The absolute value is: " +x);
    }
}
