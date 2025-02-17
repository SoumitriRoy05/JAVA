// package Day_5; 

class Vehicle {  
    String model;
    int year;

    public Vehicle(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Model: " + model + ", Year: " + year);
    }
}

class Car extends Vehicle {  
    int numDoors;
    String fuelType;

    public Car(String model, int year, int numDoors, String fuelType) {
        super(model, year);
        this.numDoors = numDoors;
        this.fuelType = fuelType;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Doors: " + numDoors + ", Fuel Type: " + fuelType);
    }
    public static void main(String[] args) {
        Car myCar = new Car("Toyota Fortuner", 2022, 4, "Petrol");
    myCar.displayInfo();
    }
}

