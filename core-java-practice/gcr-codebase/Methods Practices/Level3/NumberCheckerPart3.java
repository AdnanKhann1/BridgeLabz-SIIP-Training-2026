import java.util.Scanner;

public class NumberCheckerPart3 {

    private static int sumProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumProperDivisors(number) == number;
    }

    public static boolean isAbundantNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumProperDivisors(number) > number;
    }

    public static boolean isDeficientNumber(int number) {
        if (number <= 0) {
            return false;
        }
        return sumProperDivisors(number) < number;
    }

    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = Math.abs(number);
        if (number == 0) {
            return false;
        }
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for Part 3 Verification: ");
        int input = scanner.nextInt();

        System.out.println("Is Perfect Number: " + isPerfectNumber(input));
        System.out.println("Is Abundant Number: " + isAbundantNumber(input));
        System.out.println("Is Deficient Number: " + isDeficientNumber(input));
        System.out.println("Is Strong Number: " + isStrongNumber(input));
        
        scanner.close();
    }
}