import java.util.Scanner;

public class DivisionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number (dividend): ");
        int number = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        if (divisor == 0) {
            System.err.println("Error: Division by zero is not allowed.");
            System.exit(0);
        }

        int[] results = findRemainderAndQuotient(number, divisor);

        System.out.println("Quotient: " + results[1]);
        System.out.println("Remainder: " + results[0]);
        
        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}