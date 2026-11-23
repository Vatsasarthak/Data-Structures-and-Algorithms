class Solution {
    int nums[];
    int n;
    long dp[][];
    public long helper(int idx, int parity){
        //base
        if(idx == nums.length-1){
            if(parity == 1) return (long)1e16;
            return 0;
        }
        if(dp[idx][parity] != -1) return dp[idx][parity];

        return dp[idx][parity] = Math.min(helper(idx+1, parity), nums[idx] + helper(idx
        +1 , 1-parity));
    }
    public long minCost(int[] nums) {
        n = nums.length;
        this.nums = nums;

        dp = new long[n][2];
        for(int i = 0; i < n;i++){
            Arrays.fill(dp[i], -1);
        }
        
        long ans = helper(1 , 0);
        if(ans <= 0) return ans + nums[0] + nums[n-1];

        return nums[0] + nums[n-1];
    }
}