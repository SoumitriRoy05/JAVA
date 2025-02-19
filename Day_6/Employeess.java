package Day_6;

import java.util.Scanner;

class employee
{
	String name;
	int id;
	double salary;
	public employee(String name, int id, double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	public void displayDetails()
	{
		System.out.println("\n Employee Details:");
		System.out.println("Name:" +name);
		System.out.println("Employee Id:" +id);
		System.out.println("Salary:" +salary);
	}
}
class Manager extends employee
{
	double bonus;
	public Manager(String name, int id, double salary, double bonus)
	{
		super(name,id,salary);
		this.bonus=bonus;
	}
	@Override
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Bonus:" +bonus);
	}
}
public class Employeess {
   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter Employee Name: ");
	        String empName = scanner.nextLine();
	        System.out.print("Enter Employee ID: ");
	        int empId = scanner.nextInt();
	        System.out.print("Enter Employee Salary: ");
	        double empSalary = scanner.nextDouble();
	        System.out.print("Enter Manager Name: ");
	        scanner.nextLine();
	        String mgrName = scanner.nextLine();
	        System.out.print("Enter Manager ID: ");
	        int mgrId = scanner.nextInt();
	        System.out.print("Enter Manager Salary: ");
	        double mgrSalary = scanner.nextDouble();
	        System.out.print("Enter Manager Bonus: ");
	        double mgrBonus = scanner.nextDouble();
	        employee emp = new employee(empName, empId, empSalary);
	        Manager mgr = new Manager(mgrName, mgrId, mgrSalary, mgrBonus);
	        emp.displayDetails();
	        mgr.displayDetails();

	        scanner.close();
}  
}
