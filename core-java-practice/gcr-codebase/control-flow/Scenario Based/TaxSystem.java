import java.util.Scanner;

public class TaxSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double income = sc.nextDouble();
        double tax;

        if (income < 10000) {
            tax = income * 0.05;
            System.out.println("Tax Bracket: 5%");
        } else if (income <= 50000) {
            tax = income * 0.15;
            System.out.println("Tax Bracket: 15%");
        } else {
            tax = income * 0.30;
            System.out.println("Tax Bracket: 30%");
        }

        System.out.println("Tax Amount: " + tax);

        double[] citizens = new double[10];
        double totalTax = 0;

        for (int i = 0; i < 10; i++) {
            citizens[i] = sc.nextDouble();

            if (citizens[i] < 10000) {
                totalTax += citizens[i] * 0.05;
            } else if (citizens[i] <= 50000) {
                totalTax += citizens[i] * 0.15;
            } else {
                totalTax += citizens[i] * 0.30;
            }
        }

        System.out.println("Total Tax Collected: " + totalTax);

        sc.close();
    }
}