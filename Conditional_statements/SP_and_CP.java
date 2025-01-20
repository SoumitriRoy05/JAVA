package Conditional_statements;
import java.util.Scanner;
public class SP_and_CP {
    public static void main(String[] args) {
        //cost price and selling price problem
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost price:");
        int cp= sc.nextInt();
        System.out.println("Enter the selling price:");
        int sp=sc.nextInt();
        if(sp>cp)
        {
            System.out.println("Your profit is: !");
            System.out.println(sp-cp);
        }
        else
        {
            System.out.println("Yourloss is:");
            System.out.println(cp-sp);
        }
    }
    
}
