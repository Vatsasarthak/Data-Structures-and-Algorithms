import java.util.*;
public class LargestNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int lar=arr[0];
        for(int i=0;i<arr.length;i++){
            if (arr[i] > arr[0]) {
                lar=arr[i];
            }
        }
        System.out.println(lar +"");
    }
}
