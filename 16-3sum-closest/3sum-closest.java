class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int clsSum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<n;i++){
            int j=i+1, k=n-1;
            
            while(j<k){
                int currSum = nums[i]+nums[j]+nums[k];

                if(Math.abs(currSum-target)<Math.abs(clsSum-target)){
                    clsSum=currSum;
                }
                if(currSum<target){
                    j++;
                }else if(currSum>target){
                    k--;
                }else{
                    return currSum;
                }
            }
        }
        return clsSum;
    }
}