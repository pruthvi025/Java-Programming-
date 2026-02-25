// Hybrid Inheritance Example
// Combination of Hierarchical + Multilevel Inheritance

public class HybridDemo {

    public static void main(String[] args) {

        // Multilevel inheritance object
        Car car = new Car("Mahindra", 2500000, "XUV700");
        car.displayCompany();
        car.work();
        car.displayCarDetails();

        System.out.println("-------------------");

        // Hierarchical inheritance object
        TataMotors tata = new TataMotors("TATA Motors");
        tata.displayCompany();
        tata.work();

        System.out.println("-------------------");

        // Polymorphism demonstration
        Company obj = new Car("Mahindra", 2000000, "Scorpio");
        obj.displayCompany();  // Allowed
        obj.work();            // Runtime polymorphism
    }
}


// Base Class
class Company {

    private String name;

    public Company(String name) {
        this.name = name;
    }

    public void displayCompany() {
        System.out.println("Company Name: " + name);
    }

    public void work() {
        System.out.println("Company performs operations");
    }
}


// First Level Child (Hierarchical)
class Mahindra extends Company {

    public Mahindra(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("Mahindra manufactures vehicles");
    }
}


// Multilevel Inheritance
class Car extends Mahindra {

    private int price;
    private String model;

    public Car(String name, int price, String model) {
        super(name);
        this.price = price;
        this.model = model;
    }

    public void displayCarDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Price: " + price);
    }
}


// Second branch of Hierarchical Inheritance
class TataMotors extends Company {

    public TataMotors(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println("TATA Motors manufactures motors and vehicles");
    }
}