class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int num : nums){
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return gcf(min,max);
    }
    private static int gcf(int min, int max){
        while(max != 0){
            int temp = max;
            max = min % max;
            min = temp;
        }
        return min;
    }
}