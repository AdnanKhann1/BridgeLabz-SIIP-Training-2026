import java.util.Scanner;

public class NumberReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long inputNumber = scanner.nextLong();
        
        long temp = Math.abs(inputNumber);
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
        temp = Math.abs(inputNumber);
        
        for (int i = 0; i < digitCount; i++) {
            digits[i] = (int) (temp % 10);
            temp /= 10;
        }

        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < digitCount; i++) {
            reversedDigits[i] = digits[i];
        }

        System.out.print("Reversed digits sequence: ");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
        scanner.close();
    }
}