public class RecursiveSolvers {

    public static int towerOfHanoi(int n, char fromRod, char toRod, char auxRod) {
        if (n == 0) {
            return 0;
        }
        int moves = towerOfHanoi(n - 1, fromRod, auxRod, toRod);
        System.out.println("Move disk " + n + " from rod " + fromRod + " to rod " + toRod);
        moves++;
        moves += towerOfHanoi(n - 1, auxRod, toRod, fromRod);
        return moves;
    }

    public static int binarySearch(int[] prices, int target, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (prices[mid] == target) {
            return mid;
        } else if (prices[mid] > target) {
            return binarySearch(prices, target, low, mid - 1);
        } else {
            return binarySearch(prices, target, mid + 1, high);
        }
    }

    public static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    public static String reverseString(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }

    public static boolean isBalanced(String str) {
        return checkBalance(str, 0, 0);
    }

    private static boolean checkBalance(String str, int index, int count) {
        if (count < 0) {
            return false;
        }
        if (index == str.length()) {
            return count == 0;
        }
        char ch = str.charAt(index);
        if (ch == '(') {
            return checkBalance(str, index + 1, count + 1);
        } else if (ch == ')') {
            return checkBalance(str, index + 1, count - 1);
        }
        return checkBalance(str, index + 1, count);
    }
}