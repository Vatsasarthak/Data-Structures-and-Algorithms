import java.util.*;

import static java.lang.Integer.max;

public class MaximumSubarray {
    public static void main(String args[]){
        Scanner scn=new Scanner (System.in);
        int n =scn.nextInt();
        int[] nums=new int[n];
        for(int i =0;i<n;i++){
            nums[i]= scn.nextInt();
        }
        int sum=nums[0];
        int maxSum=nums[0];
        for(int i=1;i<nums.length;i++){
                sum = max(nums[i], sum + nums[i]);
            maxSum = max(maxSum, sum);
        }
        System.out.println(maxSum);
    }
}
