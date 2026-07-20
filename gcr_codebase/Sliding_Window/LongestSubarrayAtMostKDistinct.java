import java.util.*;

public class LongestSubarrayAtMostKDistinct {
    public static int longestSubarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int left = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > k) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3};
        int k = 2;
        System.out.println(longestSubarray(arr, k));
    }
}
