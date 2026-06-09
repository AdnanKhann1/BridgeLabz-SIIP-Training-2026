public class FeeDiscount {
    public static void main(String args[]) {
        int fee = 125000;
        int discount_percent = 10;

        double discount = (fee * discount_percent) / 100.0;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);
    }
}