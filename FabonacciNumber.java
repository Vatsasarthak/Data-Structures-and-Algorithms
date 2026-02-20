import java.util.Scanner;
public class FabonacciNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=fabonac(n);
        System.out.println(res);
    }
    public static int fabonac(int n){
        if(n == 0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return fabonac(n - 1) + fabonac(n - 2);
    }
}
