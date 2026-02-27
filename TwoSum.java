import java.util.*;
public class TwoSum {
    public static void main(String args[ ]){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int[] nums=new int[n];
    for(int i =0;i<n;i++){
        nums[i]=sc.nextInt();
    }
    System.out.println("Give me the Target");
    int k=sc.nextInt();
    for(int i=0;i<n;i++) {
        for (int j = 0; j < i; j++) {
            if (nums[i] +nums[j]==k){
                System.out.println(nums[i] + " " + nums[j]);
                break;
            }
        }
    }
    }
}
