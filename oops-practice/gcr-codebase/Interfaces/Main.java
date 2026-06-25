interface CouponValidator {

    // Abstract method
    boolean validateCoupon(String code);

    // Static method
    static boolean isLengthValid(String code) {
        return code.length() >= 5 && code.length() <= 10;
    }
}

class ShoppingCart implements CouponValidator {

    @Override
    public boolean validateCoupon(String code) {

        // Check length using static method
        if (!CouponValidator.isLengthValid(code)) {
            return false;
        }

        // Coupon should start with "SAVE"
        return code.startsWith("SAVE");
    }
}

public class Main {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE10",
                "SAVE50",
                "ABC12",
                "SAVE",
                "SAVE1000",
                "DISCOUNT"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {
            if (cart.validateCoupon(coupon)) {
                System.out.println(coupon + " -> Valid Coupon");
            } else {
                System.out.println(coupon + " -> Invalid Coupon");
            }
        }
    }
}