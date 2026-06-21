import java.util.Scanner;

public class NumberClassifier {

    public static boolean isPositive(int number) {
        return number >= 0;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 < number2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.println("\n--- Classification Results ---");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Number " + numbers[i] + " is ");
            if (isPositive(numbers[i])) {
                System.out.print("Positive and ");
                if (isEven(numbers[i])) {
                    System.out.println("Even");
                } else {
                    System.out.println("Odd");
                }
            } else {
                System.out.println("Negative");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.println("\n--- Boundary Elements Comparison ---");
        System.out.print("First element (" + numbers[0] + ") is ");
        if (comparisonResult == 1) {
            System.out.println("greater than the last element (" + numbers[numbers.length - 1] + ")");
        } else if (comparisonResult == -1) {
            System.out.println("less than the last element (" + numbers[numbers.length - 1] + ")");
        } else {
            System.out.println("equal to the last element (" + numbers[numbers.length - 1] + ")");
        }
        scanner.close();
    }
}