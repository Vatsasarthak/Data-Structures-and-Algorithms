class Solution {
    public int countKthRoots(int l, int r, int k) {
        return(int) (maxRoot(r, k ) - maxRoot(l - 1 , k));
    }
    private long maxRoot(long n ,long k){
        if(n < 0) return -1;
        if(n== 0) return 0;
        if(k == 1) return n;

        long low = 1;
        long high =(long) Math.pow(n , 1.0 /k) + 2;
        long ans = 0;
        while(low <= high){
            long mid = low +(high - low) / 2;
            if(canRaise(mid , k ,n)){
                ans= mid;
                low=mid + 1;
            }
            else{
                high = mid -1;
            }
        }
        return ans;
            }
    private boolean canRaise(long base , long exp , long limit){
        long current = 1;
        for(long i =0;i<exp;i++){
            if(current > limit / base){
                return false;
            }
            current *= base;
        }
        return true;
    }
}