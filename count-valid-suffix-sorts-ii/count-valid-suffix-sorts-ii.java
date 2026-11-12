long suff[] = new long[res.length];
        j = suff.length - 1;
        hash = 0;
        p = 1;
        
        long temp[] = new long[res.length];
        j = 0;
        // 2 + 2* 31 + 3 * 31 * 31
        //2 + 2 * 31 + 3 * 31 * 31 + 2 * 31 *31 * 31
        for (i = 0; i < target.length; i++) {
            if (i >= nums.length) {
                hash = (hash - target[i - nums.length] + MOD) % MOD;
                hash = hash * inv % MOD;
                hash = (hash + target[i] * p % MOD) % MOD;
                temp[j++] = hash;
            }
            else if (i >= nums.length - 1) {
                hash = (hash + target[i] * p % MOD) % MOD;
                temp[j++] = hash;
            }
            else {
                hash = (hash + target[i] * p % MOD) % MOD;
                p = p * 31 % MOD;
            }
        }
        for (i = 0; i < res.length; i++) {
            res[i] = h.getOrDefault(temp[i], 0);
        }
        return res;
    }
}