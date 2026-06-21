import java.util.Scanner;

public class TeamBMITracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] metrics = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.println("\nMetrics entry for Member " + (i + 1) + ":");
            System.out.print("Enter weight (in kg): ");
            metrics[i][0] = scanner.nextDouble();
            System.out.print("Enter height (in cm): ");
            metrics[i][1] = scanner.nextDouble();
        }

        calculateBMIs(metrics);
        String[] statuses = determineStatuses(metrics);

        System.out.println("\n--- Team BMI Summary Dashboard ---");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Member %-2d | Weight: %6.2f kg | Height: %6.2f cm | BMI: %5.2f | Status: %s%n",
                    (i + 1), metrics[i][0], metrics[i][1], metrics[i][2], statuses[i]);
        }
        scanner.close();
    }

    public static void calculateBMIs(double[][] metrics) {
        for (int i = 0; i < metrics.length; i++) {
            double weightKg = metrics[i][0];
            double heightMeters = metrics[i][1] / 100.0;
            metrics[i][2] = weightKg / (heightMeters * heightMeters);
        }
    }

    public static String[] determineStatuses(double[][] metrics) {
        String[] statuses = new String[metrics.length];
        for (int i = 0; i < metrics.length; i++) {
            double bmi = metrics[i][2];
            if (bmi < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmi < 25.0) {
                statuses[i] = "Normal weight";
            } else if (bmi < 30.0) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        return statuses;
    }
}