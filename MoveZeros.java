import java.util.*;
public class MoveZeros {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Give the value of the N\t");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<nums.length;i++){
            if (nums[i] != 0) {
                nums[temp]=nums[i];
                temp++;
            }
        }
        while(temp<n){
            nums[temp]=0;
            temp++;
        }
        for(int i=0;i<n;i++) {
            System.out.print(nums[i]);
        }
    }
}
