
public class TwoSumSorted {

    public static int[] twoSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 7, 11, 15};
        int target = 15;

        int[] result = twoSum(arr, target);

        if (result[0] != -1) {
            System.out.println(result[0] + " " + result[1]);
        } else {
            System.out.println("Not found");
        }
    }
}
