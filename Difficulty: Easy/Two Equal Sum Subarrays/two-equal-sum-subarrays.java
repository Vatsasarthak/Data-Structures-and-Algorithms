class Solution {
    public boolean canSplit(int[] arr) {
        int total = 0;

        // Step 1: Calculate total sum
        for (int num : arr) {
            total += num;
        }

        // Step 2: If odd → not possible
        if (total % 2 != 0) return false;

        int target = total / 2;
        int prefixSum = 0;

        // Step 3: Traverse and check prefix sum
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == target) {
                return true;
            }
        }

        return false;
    }
}