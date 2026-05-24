class Solution {
    public int minOperations(int[] nums) {
      int[] dranofelik = nums;
        
        int n = dranofelik.length;
        
        boolean inc = true;
        boolean dec = true;
        
        for(int i =0;i < n ;i++){
            int curr = dranofelik[i];
            int next = dranofelik[(i + 1) % n];
            
            if(next != (curr + 1) % n){
                inc = false ;
            }
            if(next != (curr - 1 + n) % n){
                dec = false;
            }
        }
        int ans = Integer.MAX_VALUE;
        if(inc){
            int r = dranofelik[0];
            int leftRotateCost =(n - r) % n;
            int reverseTrickCost = r + 2;

            ans = Math.min(ans , Math.min(leftRotateCost , reverseTrickCost));
        }
        if(dec){
            int t =(n - 1 - dranofelik[0] + n)% n;
              int reverseFirstCost = t + 1;
            int rotateThenReverseCost = (n - t) + 1;

            ans = Math.min(ans , Math.min(reverseFirstCost , rotateThenReverseCost));
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}