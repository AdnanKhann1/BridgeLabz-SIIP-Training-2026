import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Input employee details
        for (int i = 0; i < 10; i++) {
            System.out.println("\nEmployee " + (i + 1));

            System.out.print("Enter Salary: ");
            salary[i] = sc.nextDouble();

            System.out.print("Enter Years of Service: ");
            yearsOfService[i] = sc.nextDouble();

            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please enter again.");
                i--; // repeat input for same employee
                continue;
            }
        }

        // Calculate bonus and new salary
        for (int i = 0; i < 10; i++) {

            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display employee details
        System.out.println("\nEmployee Details:");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Emp\tOld Salary\tYears\tBonus\t\tNew Salary");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t\t%.1f\t%.2f\t\t%.2f%n",
                    (i + 1),
                    salary[i],
                    yearsOfService[i],
                    bonus[i],
                    newSalary[i]);
        }

        System.out.println("--------------------------------------------------------------");

        // Display totals
        System.out.printf("Total Old Salary : %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Payout : %.2f%n", totalBonus);
        System.out.printf("Total New Salary : %.2f%n", totalNewSalary);

        sc.close();
    }
}