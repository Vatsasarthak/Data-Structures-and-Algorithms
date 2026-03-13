import java.util.*;
public class maxFrequency {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the size of the Array-\t");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of the K-\t");
        int k=sc.nextInt();
        Arrays.sort(nums);
        int left = 0;
        long sum = 0;
        int ans = 0;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while ((long) nums[right] * (right - left + 1) - sum > k) {
                sum -= nums[left];
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        System.out.println(ans);
    }
}
