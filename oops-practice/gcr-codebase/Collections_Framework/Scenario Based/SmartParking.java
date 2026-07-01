import java.util.ArrayList;

public class SmartParking {

    static ArrayList<String> vehicles = new ArrayList<>();

    static void vehicleEntry(String number) {

        vehicles.add(number);
        System.out.println(number + " Entered Parking.");
    }

    static void vehicleExit(String number) {

        if (vehicles.remove(number)) {
            System.out.println(number + " Exited Parking.");
        } else {
            System.out.println("Vehicle Not Found.");
        }
    }

    static void searchVehicle(String number) {

        if (vehicles.contains(number)) {
            System.out.println(number + " is Parked.");
        } else {
            System.out.println(number + " is Not Parked.");
        }
    }

    static void displayVehicles() {

        System.out.println("\nParked Vehicles:");

        for (String vehicle : vehicles) {
            System.out.println(vehicle);
        }

        System.out.println("Occupied Slots: " + vehicles.size());
    }

    public static void main(String[] args) {

        vehicleEntry("UP85AB1234");
        vehicleEntry("DL10XY5678");
        vehicleEntry("HR26PQ1111");

        searchVehicle("DL10XY5678");

        vehicleExit("UP85AB1234");

        displayVehicles();
    }
}
