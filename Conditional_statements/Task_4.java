package Conditional_statements;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
      System.out.println("Enter an integer:");
      int x= sc.nextInt();
      if(x>1 && x<100)
      {
       System.out.println("It is a 2-digit number");
      }
      else{
        System.out.println("It is not a 2-digit number");
      }
    }
}
