import java.util.*;
public class SingleNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int result=0;
        for(int i=0;i<nums.length;i++){
            result ^= nums[i];
        }
        System.out.println(result);
    }
}
