import java.util.*;
public class rearrangeArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int num:nums){
            if(num>0){
                pos.add(num);
            }
            else{
                neg.add(num);
            }
        }
        for(int i = 0; i < pos.size(); i++){
            nums[2*i] = pos.get(i);
            nums[2*i + 1] = neg.get(i);
        }
    }
}
