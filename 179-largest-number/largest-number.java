class Solution {
    public String largestNumber(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        if(nums[0] == 0) return "0";
        StringBuilder sb = new StringBuilder();
        for(int num : nums) sb.append(num);
        return sb.toString();
    }
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    private void quickSort(int[] nums, int start, int end){
        if(start >= end) return;
        int par = nums[end];
        int l = start, r = end - 1;
        while(l <= r){
            while(l <= r && compare(nums[l], par)){
                l++;
            }
            while(l <= r && compare(par, nums[r])){
                r--;
            }
            if(l < r) swap(nums, l, r);
        }
        swap(nums, l, end);
        quickSort(nums, start, l - 1);
        quickSort(nums, l + 1, end);
    }
    private boolean compare(int a, int b){
        long aBase = calcBase(a), bBase = calcBase(b);
        return (a * bBase + b) >= (b * aBase + a);       
    }
    private long calcBase(int num){
        if(num == 0) return 10;
        long ans = 1;
        while(num > 0) {
            ans = ans * 10;
            num /= 10;
        }
        return ans;
    }
}