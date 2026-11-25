if (r - l + 1 == k) {

                // Store frequency of current hash
                mp.put(hash, mp.getOrDefault(hash, 0) + 1);

                // Remove outgoing element
                hash = (hash - nums[l] * p % mod + mod) % mod;

                l++;
            }
            r++;
        }

        // Check whether a unique subarray exists
        for (int e : mp.values()) {
            if (e == 1) return true;
        }

        return false;
    }

    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        int l = 1;
        int h = n;
        int ans = n;

        // Binary Search on Answer
        while (l <= h) {
            int m = l + (h - l) / 2;

            if (isValid(nums, m)) {
                h = m - 1;
                ans = m;
            } else {
                l = m + 1;
            hash = (hash * base + nums[r]) % mod;
            // Add incoming element

        while (r < n) {
        // Sliding Window + Rolling Hash

        }
            p = (p * base) % mod;