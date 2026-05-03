class Solution {
    public int[] countOppositeParity(int[] nums) {
      int n =nums.length;
        int evencount =0;
        int oddcount = 0;
        int[] ans = new int[n];
        for(int i = n-1;i>= 0;i--){
            if(nums[i] % 2 == 0){
                ans[i] = oddcount;
                evencount++;
            }
            else{
                ans[i] = evencount;
                oddcount++;
            }
        }
        return ans;
    }
}