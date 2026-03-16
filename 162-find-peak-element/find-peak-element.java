class Solution {
    public int findPeakElement(int[] nums) {
        int peak=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>peak){
                peak=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==peak){
                return i;
            }
        }
        return -1;
    }
}