import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        long temp = Math.abs(number);
        int digitCount = 0;

        if (temp == 0) {
            digitCount = 1;
        } else {
            while (temp > 0) {
                digitCount++;
                temp /= 10;
            }
        }

        int[] digits = new int[digitCount];
        temp = Math.abs(number);
        
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++) {
            int digitValue = digits[i];
            frequency[digitValue]++;
        }

        System.out.println("Digit frequencies inside the number:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " time(s)");
            }
        }
        scanner.close();
    }
}