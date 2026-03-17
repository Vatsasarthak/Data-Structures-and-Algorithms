class Solution {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
      int lowid=0;
      int res=1;
      int count=1;
      while(count<n){
        if(nums[count]==nums[count-1]){
            count++;
        }
        else{
            nums[lowid+1]=nums[count];
            count++;
            res++;
            lowid++;
        }
      }
      return res;  
    }
}