//package Experiments_class;

class Student {
    String name;
    String registrationNumber;
    String branch;
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Branch: " + branch);
    }
}

public class Exp_1_5 {
// import java.util.Scanner;
    public static void main(String[] args) {
        Student sc = new Student();
        sc.name = "Soumitri Roy";
        sc.registrationNumber = "290";
        sc.branch = "Computer Science";
        System.out.println("Student Details:");
        sc.displayDetails();
    }
}
