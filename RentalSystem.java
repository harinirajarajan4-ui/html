// Vehicle interface
interface Vehicle {
    void start();
    void stop();
}

// FuelBased interface
interface FuelBased {
    void refuel();
}

// Car class implementing both Vehicle and FuelBased
class Car implements Vehicle, FuelBased {
    @Override
    public void start() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void refuel() {
        System.out.println("Car is refueling at the station.");
    }
}

// ElectricScooter class implementing only Vehicle
class ElectricScooter implements Vehicle {
    @Override
    public void start() {
        System.out.println("Electric scooter powered on.");
    }

    @Override
    public void stop() {
        System.out.println("Electric scooter powered off.");
    }
}

// RentalSystem class with main method
public class RentalSystem {
    public static void main(String[] args) {
        Car car = new Car();
        ElectricScooter scooter = new ElectricScooter();

        // Simulate Car behavior
        car.start();
        car.refuel();
        car.stop();

        System.out.println();

        // Simulate Electric Scooter behavior
        scooter.start();
        scooter.stop();
    }
}
