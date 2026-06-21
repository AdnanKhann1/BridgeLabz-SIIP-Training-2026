import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter air temperature (in Fahrenheit): ");
        double temperature = scanner.nextDouble();
        System.out.print("Enter wind speed (in miles per hour): ");
        double windSpeed = scanner.nextDouble();

        WindChillCalculator calculator = new WindChillCalculator();
        double windChill = calculator.calculateWindChill(temperature, windSpeed);

        System.out.printf("Calculated Wind Chill Temperature: %.2f%n", windChill);

        scanner.close();
    }

    public double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275 * temperature * Math.pow(windSpeed, 0.16));
    }
}