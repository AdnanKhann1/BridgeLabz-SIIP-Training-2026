import java.util.Scanner;

public class BMIReport {

    // Method to calculate BMI and status for one person
    public static String[] getBMIAndStatus(double weight, double heightCm) {

        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        return new String[]{
                String.format("%.2f", bmi),
                status
        };
    }

    // Method to generate report
    public static String[][] generateReport(double[][] data) {

        String[][] report = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double height = data[i][1];

            String[] bmiData = getBMIAndStatus(weight, height);

            report[i][0] = String.valueOf(height);
            report[i][1] = String.valueOf(weight);
            report[i][2] = bmiData[0];
            report[i][3] = bmiData[1];
        }

        return report;
    }

    // Method to display report
    public static void displayReport(String[][] report) {

        System.out.printf("%-8s %-12s %-12s %-10s %-15s%n",
                "Person", "Height(cm)", "Weight(kg)", "BMI", "Status");

        for (int i = 0; i < report.length; i++) {

            System.out.printf("%-8d %-12s %-12s %-10s %-15s%n",
                    (i + 1),
                    report[i][0],
                    report[i][1],
                    report[i][2],
                    report[i][3]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[][] data = new double[10][2];

        for (int i = 0; i < 10; i++) {

            System.out.println("\nEnter details for Person " + (i + 1));

            System.out.print("Weight (kg): ");
            data[i][0] = sc.nextDouble();

            System.out.print("Height (cm): ");
            data[i][1] = sc.nextDouble();
        }

        String[][] report = generateReport(data);

        System.out.println("\nBMI REPORT");
        displayReport(report);

        sc.close();
    }
}