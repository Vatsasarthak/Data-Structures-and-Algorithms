class Solution {
    public int shipWithinDays(int[] weights, int days) {
        return minimumdays(weights, days);
    }

    int minimumdays(int[] weights, int days) {
        int sum = 0;
        for (int num : weights) {
            sum += num;
        }
        int low = 0;
        for (int w : weights) {
            low = Math.max(low, w); 
        }
        int high = sum;
        int ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int least = capacity(weights, mid, days);
            if (least <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    int capacity(int[] weights, int mid, int days) {
        int count = 1;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {

            if (sum + weights[i] <= mid) {
                sum += weights[i];
            } else {
                count++;
                sum = weights[i];
            }
        }
        return count;
    }
}