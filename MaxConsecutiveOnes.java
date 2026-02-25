import java.util.*;
public class MaxConsecutiveOnes {
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);
        int n =scn.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]= scn.nextInt();
        }
        int count=0;
        int max=0;
        for(int i=0;i<num.length;i++){
            if(num[i]==1){
                count++;
                if(max<count){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(max);
    }
}
