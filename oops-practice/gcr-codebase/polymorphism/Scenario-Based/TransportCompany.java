class Vehicle {
    String name;

    Vehicle(String name) {
        this.name = name;
    }

    int fuelCost(int km) {
        return 0;
    }
}

class Car extends Vehicle {
    Car(String name) {
        super(name);
    }

    @Override
    int fuelCost(int km) {
        return 10 * km;
    }
}


class Bus extends Vehicle {
    Bus(String name) {
        super(name);
    }

    @Override
    int fuelCost(int km) {
        return 12 * km;
    }
}


class Bike extends Vehicle {
    Bike(String name) {
        super(name);
    }

    @Override
    int fuelCost(int km) {
        return 8 * km;
    }
}

public class Main {
    public static void main(String[] args) {

        Vehicle[] vehicles = {
            new Car("Harrier"),
            new Bus("Roadways"),
            new Bike("Splendor")
        };

        int km = 10;

        for (Vehicle ele : vehicles) {
            System.out.println(ele.name + " : " + ele.fuelCost(km));
        }
    }
}