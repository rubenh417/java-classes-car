package javaclass;

public class Car {
    private String make;
    private String model;
    private int year;
    

    // Empty constructor
    public Car() {
        this.make = "";
        this.model = "";
        this.year = -1;  // default value changed to -1
    }

    // Constructor with make and model
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.year = -1;  // default value changed to -1
    }

    // Constructor with all attributes
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter methods
    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getYear() {
        return this.year;
    }

    // Setter methods
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Boolean method to check if car is new
    public boolean isNew() {
        return this.year == -1;  // checking for -1 instead of 0
    }

    // String method to print car details
    public String printDetails() {
        String details = "Make: " + this.make + "\n";
        details += "Model: " + this.model + "\n";
        details += "Year: " + (this.year == -1 ? "Unknown" : this.year) + "\n";
        return details;
    }

    // Main method
    public static void main(String[] args) {
        // create a new Car object
        Car car = new Car("Toyota", "Camry", 2022);
        
        // print the car details
        System.out.println(car.printDetails());
    }
}
