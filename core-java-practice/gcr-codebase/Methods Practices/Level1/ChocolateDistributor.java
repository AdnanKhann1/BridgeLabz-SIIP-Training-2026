import java.util.Scanner;

public class ChocolateDistributor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        System.out.print("Enter total number of children: ");
        int numberOfChildren = scanner.nextInt();

        if (numberOfChildren <= 0) {
            System.err.println("Error: Number of children must be greater than zero.");
            System.exit(0);
        }

        int[] distribution = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Chocolates each child will get: " + distribution[1]);
        System.out.println("Remaining chocolates: " + distribution[0]);

        scanner.close();
    }

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[]{remainder, quotient};
    }
}