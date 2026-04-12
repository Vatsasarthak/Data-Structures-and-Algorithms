class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for (int num : nums) {
            if (num == 0 && digit == 0) {
                count++;
            }
            while (num > 0) {
                int last = num % 10;
                if (last == digit) {
                    count++;
                }
                num = num / 10;
            }
        }
        return count;
    }
}