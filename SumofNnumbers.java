import java.util.*;
public class SumofNnumbers {
    public static int NumberSum(int n ){
        if(n==1){
            return 1;}
        int ans=NumberSum(n-1);
        return ans + n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int result=NumberSum(n);
        System.out.println(result);
    }
}
