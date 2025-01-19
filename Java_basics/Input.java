package Java_basics;
import java.util.Scanner;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius:");
        int radius=sc.nextInt();
        double pi=3.14;
        double area=pi*radius*radius;
        System.out.println("Area of circle: "+area);

    }
}
