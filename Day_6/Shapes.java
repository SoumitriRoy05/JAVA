package Day_6;

import java.util.Scanner;

abstract class shape
{
	public abstract double find_Area();
}
class Square extends shape
{
	private double side;
	public Square(double side)
	{
		this.side=side;
	}
	@Override
	public double find_Area()
	{
		return side*side;
	}
}
class Rectangle extends shape
{
	private double length, breadth;
	public Rectangle(double length, double breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	@Override
	public double find_Area()
	{
		return length*breadth;
	}
}
public class Shapes {
   public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("\n Choose a shape to calculate area:");
			 System.out.println("1. Square\n2. Rectangle\n3. Exit");
	            System.out.print("Enter choice: ");
	            int choice = sc.nextInt();
	            shape shape = null;

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter side length of the square: ");
	                    double side = sc.nextDouble();
	                    shape = new Square(side);
	                    break;
	                case 2:
	                	System.out.println("Enter length of rectangle:");
	                	double length=sc.nextDouble();
	                	System.out.println("Enter breath of rectangle:");
	                	double breadth=sc.nextDouble();
	                	shape= new Rectangle(length, breadth);
	                	break;
	                case 3:
	                    System.out.println("Exiting...");
	                    sc.close();
	                    return;

	                default:
	                    System.out.println("Invalid choice! Try again.");
	                    continue;
	            }
	            System.out.println("Area is: " +shape.find_Area());

		}
	} 
}
