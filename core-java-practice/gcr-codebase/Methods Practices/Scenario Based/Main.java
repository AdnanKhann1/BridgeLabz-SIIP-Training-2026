class MathWizard {
    int instanceVar = 100;

    boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    long factorial(int n) {
        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }

    double factorial(double n) {
        int num = (int) n;
        double fact = 1;

        for (int i = 1; i <= num; i++) {
            fact *= i;
        }

        return fact;
    }

    void fibonacci(int n) {
        int a = 0;
        int b = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    long power(int base, int exp) {
        long result = 1;

        for (int i = 1; i <= exp; i++) {
            result *= base;
        }

        return result;
    }

    void showScope() {
        int localVar = 50;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
    }
}

public class Main {
    public static void main(String[] args) {
        MathWizard mw = new MathWizard();

        System.out.println("Prime Check (17): " + mw.isPrime(17));

        System.out.println("Factorial(int): " + mw.factorial(5));

        System.out.println("Factorial(double): " + mw.factorial(6.0));

        System.out.print("Fibonacci Series: ");
        mw.fibonacci(10);

        System.out.println("GCD(24, 36): " + mw.gcd(24, 36));

        System.out.println("LCM(24, 36): " + mw.lcm(24, 36));

        System.out.println("Power(2, 10): " + mw.power(2, 10));

        mw.showScope();
    }
}