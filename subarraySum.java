import java.util.*;

public class SubarraySum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Give the Array");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Give me the value of k");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0;
        int count = 0;

        map.put(0, 1);  // important base case

        for (int num : nums) {

            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Total Subarrays = " + count);
    }
}