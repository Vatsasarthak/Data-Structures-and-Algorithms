import java.util.*;
public class LeftRoatateby1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        if(n==0) return;
        int first=nums[0];
        for(int i=1;i<nums.length;i++){
            nums[i-1]= nums[i];
        }
        nums[n-1]=first;
        for(int i=0;i<n;i++){
            System.out.println(nums[i]);
        }
    }
}
