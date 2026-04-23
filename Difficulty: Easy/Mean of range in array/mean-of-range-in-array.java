import java.util.*;

class Solution {
    public ArrayList<Integer> findMean(int[] arr, int[][] queries) {
        int n = arr.length;
        
        // Prefix sum
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + arr[i];
        }

        ArrayList<Integer> res = new ArrayList<>();

        // Process queries
        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            long sum = prefix[r + 1] - prefix[l];
            int len = r - l + 1;

            res.add((int)(sum / len)); // floor
        }

        return res;
    }
}