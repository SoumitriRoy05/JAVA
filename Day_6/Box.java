package Day_6;

import java.util.Scanner;

class Box_1
{
	double width, height, depth;
	public Box_1(double width, double height, double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	public double volume()
	{
		return width*height*depth;
	}
}
class BoxWeight extends Box_1
{
	public BoxWeight(double width, double height, double depth)
	{
		super(width,height,depth);
	}
	public double calculateShippingCost(double distance, double costPerKm) {
        double volume = volume();
        return distance * volume * costPerKm;
	}
}
public class Box {
    public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	  System.out.print("Enter width of the box: ");
      double width = sc.nextDouble();
      System.out.print("Enter height of the box: ");
      double height = sc.nextDouble();
      System.out.print("Enter depth of the box: ");
      double depth = sc.nextDouble();
      System.out.print("Enter distance in km: ");
      double distance = sc.nextDouble();
      System.out.print("Enter cost per km: ");
      double costPerKm = sc.nextDouble();
      BoxWeight box = new BoxWeight(width, height, depth);
      double volume = box.volume();
      double shippingCost = box.calculateShippingCost(distance, costPerKm);
      System.out.println("\nVolume of the box: " + volume);
      System.out.println("Shipping cost: " + shippingCost);
}
}
