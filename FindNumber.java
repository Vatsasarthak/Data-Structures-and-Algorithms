import java.util.*;
public class FindNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        int sum= n*(n + 1)/2;
        int gpt=0;
    for(int i=0;i<nums.length;i++){
        gpt=gpt+nums[i];
    }
    int sum2;
         sum2=sum-gpt;
       System.out.println(sum2);
    }
    }

