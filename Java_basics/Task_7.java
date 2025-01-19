package Java_basics;
import java.util.*;
public class Task_7 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= sc.nextInt();
        System.out.println("Enter the value of b:");
        int b=sc.nextInt();
        int remainder=a-b*(a/b);
        System.out.println("The remainder: "+remainder);
    }
}
