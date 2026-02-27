import java.util.*;

public class MajorityElements {
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] nums = new int[n];

        for(int i = 0; i < n; i++){
            nums[i] = scn.nextInt();
        }

        int maxCount = 0;
        int majorityElement = -1;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }

            if(count > maxCount){
                maxCount = count;
                majorityElement = nums[i];
            }
        }

        if(maxCount > n/2){
            System.out.println(majorityElement);
        } else {
            System.out.println("No Majority Element");
        }
    }
}