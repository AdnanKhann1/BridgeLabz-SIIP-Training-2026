import java.util.*;

public class NextGreaterVisitors {

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {

            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = arr[i];
            }

            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] visitors = {10, 5, 8, 12, 6, 15};

        int[] result = nextGreater(visitors);

        System.out.println(Arrays.toString(result));
    }
}
