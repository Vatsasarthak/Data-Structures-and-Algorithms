import java.util.*;
public class SortedRotated {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]){
                count++;
            }
        }
        if (nums[n - 1] > nums[0]) {
            count++;
        }
        if(count<=1){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
