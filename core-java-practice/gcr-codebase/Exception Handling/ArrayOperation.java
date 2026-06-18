import java.util.Scanner;

public class ArrayOperation {
    public static void main(String[] args) {

        Integer[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index: ");
        int index = sc.nextInt();

        try {
            System.out.println("Value at index " + index + ": " + arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        }
        catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        }

        sc.close();
    }
}