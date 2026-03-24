class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        return minBanana(piles, h);
    }

    long calculatehours(int[] piles, int speed) {
        long totalhours = 0;

        for (int i = 0; i < piles.length; i++) {
            totalhours += (piles[i] + speed - 1) / speed;
        }

        return totalhours;
    }

    int minBanana(int[] piles, int h) {
        int low = 1;
        int high = 0;

        for (int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            long totalHours = calculatehours(piles, mid);

            if (totalHours <= h) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}