class Solution {
    public int sumOfPrimesInRange(int n) {
        int r = reverse(n);
        int left = Math.min(n, r);
        int right = Math.max(n, r);
        boolean[] isPrime = sieve(right);
        int sum = 0;
        for (int i = left; i <= right; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }
        return sum;
    }

    private int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }

    private boolean[] sieve(int n) {
        boolean[] prime = new boolean[n + 1];
        if (n >= 2) {
            for (int i = 2; i <= n; i++) prime[i] = true;
            for(int i=2;i * i <= n;i++){
                if (prime[i]) {
                    for (int j = i * i; j <= n; j += i) {
                        prime[j] = false;
                    }
                }
            }
        }
        return prime;
    }
}