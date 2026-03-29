class Solution {
    public int splitArray(int[] nums, int k) {
        return highestsum(nums, k);
    }

    int highestsum(int[] nums, int k) {
        int low = 0;
        for (int num : nums) {
            low = Math.max(low, num);
        }
        int high = sum(nums);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (array(nums, mid, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    int sum(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += nums[i];
        }
        return ans;
    }

    Boolean array(int[] nums, int mid, int k) {
        int ans = 0;
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + ans > mid) {
                count++;
                ans = nums[i];
            } else {
                ans += nums[i];
            }
        }
        if (count > k) {
            return false;
        } else {
            return true;
        }
    }
}