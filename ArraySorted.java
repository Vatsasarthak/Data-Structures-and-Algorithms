import java.util.*;
public class ArraySorted {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n= scn.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]= scn.nextInt();
        }
        boolean isSorted=true;
    for(int i=0;i<n-1;i++){
        if(nums[i] > nums[i+1]){
            isSorted=false;
            break;
        }
    }
    System.out.println(isSorted);
    }
}
