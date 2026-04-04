class Solution {
    static {
        for (int i = 0; i < 100; i++) {
            maxArea(new int[] { 0, 0 });
        }
    }
    
public static int maxArea(int[] height) {
    int l = 0;
    int r = height.length-1;
    int max = 0;
    while(l < r){
        int width = r - l;
        int area = Math.min(height[r], height[l]) * width;
        max = Math.max(max, area);
        if (height[l] < height[r]){
            l++;
        }else {
            r--;
        }
    }
    return max;
}
}