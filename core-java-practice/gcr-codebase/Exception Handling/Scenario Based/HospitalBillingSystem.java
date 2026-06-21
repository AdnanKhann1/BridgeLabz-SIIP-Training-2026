public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class HospitalBillingSystem {

    public double calculateAverageItemCost(double totalBill, int totalItems) {
        try {
            if (totalItems == 0) {
                throw new ArithmeticException("Division by zero condition met.");
            }
            return totalBill / totalItems;
        } catch (ArithmeticException e) {
            System.err.println("Billing Error: Cannot calculate average item cost because the bill contains zero items.");
            return 0.0;
        }
    }

    public String getPatientRecord(String[] patientDatabase, int index) {
        try {
            return patientDatabase[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Database Error: Invalid patient index " + index + " provided. Requested record does not exist.");
            return null;
        }
    }

    public double parsePaymentAmount(String input) {
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            System.err.println("Input Error: Failed to process payment amount. '" + input + "' is not a valid numeric format.");
            return 0.0;
        }
    }

    public void processPayment(double billAmount, double balance) throws InsufficientFundsException {
        if (balance < billAmount) {
            throw new InsufficientFundsException("Transaction Failed: Patient has insufficient funds. Required: $" + billAmount + ", Available: $" + balance);
        }
        System.out.println("Payment processed successfully.");
    }
}