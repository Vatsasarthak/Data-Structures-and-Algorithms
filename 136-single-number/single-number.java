class Solution {
    public int singleNumber(int[] nums) {
        int numb = nums[0];
        for(int i =1;i<nums.length;i++){
             numb = numb ^ nums[i];
        }
        return numb;
    }
}