class Solution {
    public int minOperations(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (i % 2 == 0) {
                if (!isPrime(num)) {
                    int next = num;
                    while (!isPrime(next)) {
                        next++;
                    }
                    total += (next - num);
                }
            } else {
                if (isPrime(num)) {
                    int next = num;
                    while (isPrime(next)) {
                        next++;
                    }
                    total += (next - num);
                }
            }
        }
        return total;

    }

    private boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}