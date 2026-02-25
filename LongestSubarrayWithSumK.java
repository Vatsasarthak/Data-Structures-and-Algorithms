import java.util.*;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int prefixSum = 0;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {

            prefixSum += nums[i];
            if (prefixSum == k) {
                maxLen = i + 1;
            }

            // Case 2: If (prefixSum - k) exists in map
            if (map.containsKey(prefixSum - k)) {
                int length = i - map.get(prefixSum - k);
                maxLen = Math.max(maxLen, length);
            }
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        System.out.println(maxLen);
    }
}