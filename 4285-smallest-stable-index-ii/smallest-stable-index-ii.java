class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int minR[]=new int[n];

        int curr=(int)1e9;
        for(int i=n-1;i>=0;i--){
            curr=Math.min(curr,nums[i]);
            minR[i]=curr;
        }

        int maxi=-(int)1e9;
        for(int i=0;i<n;i++){
             maxi=Math.max(maxi,nums[i]);
            int mini=minR[i];
            if(maxi-mini <= k) return i;
            
        }

        return -1;
    }
}