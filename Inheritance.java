
// Parent class
class Vehicle {
    String brand;
    int year;

    
    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    
    public void vehicleInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}

// Child class Car
class Car extends Vehicle {
    int seats;

    public Car(String brand, int year, int seats) {
        super(brand, year); // Call parent constructor
        this.seats = seats;
    }

    @Override
    public void vehicleInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Seats: " + seats);
    }
}

// Child class Bike
class Bike extends Vehicle {
    String type;

    public Bike(String brand, int year, String type) {
        super(brand, year);
        this.type = type;
    }

    @Override
    public void vehicleInfo() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Type: " + type);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        
        Car car = new Car("Toyota", 2022, 5);
        car.vehicleInfo();

        
        Bike bike = new Bike("Yamaha", 2023, "Sports");
        bike.vehicleInfo();
    }
}
