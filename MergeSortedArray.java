import java.util.*;
public class MergeSortedArray {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Give the Size of the Array 1-\t");
        int n=sc.nextInt();
        int[] nums1=new int [n];
        System.out.println("Give me the Array 1-\t");
        for(int i=0;i<n;i++){
            nums1[i]=sc.nextInt();
        }
        System.out.println("Give me the Size of the Array 2-\t");
        int m =sc.nextInt();
        int[] nums2=new int[m];
        System.out.println("Give me the Array 2 \t");
        for(int i=0;i<m;i++){
            nums2[i]=sc.nextInt();
        }
        for(int i=0;i<m;i++){
            nums1[n + i]=nums2[i];
        }
        System.out.println(nums1);
    }
}
