import java.util.Scanner;

public class TrigonometricCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter angle in degrees: ");
        double angleInDegrees = scanner.nextDouble();

        TrigonometricCalculator calculator = new TrigonometricCalculator();
        double[] trigValues = calculator.calculateTrigonometricFunctions(angleInDegrees);

        System.out.printf("Sine: %.4f%n", trigValues[0]);
        System.out.printf("Cosine: %.4f%n", trigValues[1]);
        System.out.printf("Tangent: %.4f%n", trigValues[2]);

        scanner.close();
    }

    public double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        
        return new double[]{sine, cosine, tangent};
    }
}