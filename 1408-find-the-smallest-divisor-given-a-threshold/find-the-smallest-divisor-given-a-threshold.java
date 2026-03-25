class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       return Divisor(nums , threshold); 
    }
    int Divisor(int[] nums,int threshold){
        int low =1;
   int high = 0;
        for (int num : nums) {
        high = Math.max(high, num);
            }
           int ans =-1;
        while(low <= high){
        int mid= low + (high - low ) / 2 ;
        int Smallest = ceil( nums, mid , threshold );
        if(Smallest <= threshold){
            ans =mid;
            high = mid -1;
        } 
        else {
            low=mid +1;
        }
        }
        return ans ;
    }
    int ceil(int[] nums, int mid, int threshold){
        int ans =0;
        for(int i=0;i<nums.length;i++){
            ans += (nums[i] + mid -1) / mid;
        }
        return ans ;
    }
}