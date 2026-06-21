import java.util.Arrays;
import java.util.Scanner;

public class NumberCheckerPart1 {

    public static int countDigits(int number) {
        int num = Math.abs(number);
        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }

    public static int[] storeDigits(int number) {
        int size = countDigits(number);
        int[] digits = new int[size];
        int num = Math.abs(number);
        for (int i = size - 1; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    public static boolean isPalindrome(int number) {
        int[] digits = storeDigits(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int number) {
        int[] digits = storeDigits(number);
        if (digits.length > 0 && digits[0] == 0) {
            return false;
        }
        for (int digit : digits) {
            if (digit == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for Part 1 Verification: ");
        int input = scanner.nextInt();

        int[] digits = storeDigits(input);
        int[] reversed = reverseArray(digits);

        System.out.println("Digit Count: " + countDigits(input));
        System.out.println("Digits Array: " + Arrays.toString(digits));
        System.out.println("Reversed Array: " + Arrays.toString(reversed));
        System.out.println("Is Palindrome: " + isPalindrome(input));
        System.out.println("Is Duck Number: " + isDuckNumber(input));
        
        scanner.close();
    }
}