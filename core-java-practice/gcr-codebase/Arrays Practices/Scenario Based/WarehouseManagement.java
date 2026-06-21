import java.util.*;

public class WarehouseManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] stock = new int[n];

        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int max = stock[0];
        int min = stock[0];
        int total = 0;

        for (int i = 0; i < n; i++) {
            if (stock[i] > max) {
                max = stock[i];
            }

            if (stock[i] < min) {
                min = stock[i];
            }

            total += stock[i];
        }

        System.out.println("Max Stock: " + max);
        System.out.println("Min Stock: " + min);
        System.out.println("Total Stock: " + total);

        System.out.print("Duplicates: ");
        boolean found = false;

        for (int i = 0; i < n; i++) {
            boolean printed = false;

            for (int k = 0; k < i; k++) {
                if (stock[i] == stock[k]) {
                    printed = true;
                    break;
                }
            }

            if (printed) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (stock[i] == stock[j]) {
                    System.out.print(stock[i] + " ");
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.print("None");
        }

        System.out.println();

        int k = sc.nextInt();
        k = k % n;

        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = stock[i];
        }

        System.out.print("Rotated Array: ");
        for (int x : rotated) {
            System.out.print(x + " ");
        }
        System.out.println();

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] shelf = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                shelf[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = shelf[i][j];
            }
        }

        System.out.println("Transpose Matrix:");

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}