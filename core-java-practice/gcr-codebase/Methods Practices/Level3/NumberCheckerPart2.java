import java.util.Scanner;

public class NumberCheckerPart2 {

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;
        int num = Math.abs(number);
        if (num == 0) {
            return false;
        }
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        int temp = number;
        while (temp > 0) {
            if (temp % 10 != square % 10) {
                return false;
            }
            temp /= 10;
            square /= 10;
        }
        return true;
    }

    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (Math.abs(number) % 10 == 7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number for Part 2 Verification: ");
        int input = scanner.nextInt();

        System.out.println("Is Prime Number: " + isPrime(input));
        System.out.println("Is Neon Number: " + isNeonNumber(input));
        System.out.println("Is Spy Number: " + isSpyNumber(input));
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber(input));
        System.out.println("Is Buzz Number: " + isBuzzNumber(input));
        
        scanner.close();
    }
}