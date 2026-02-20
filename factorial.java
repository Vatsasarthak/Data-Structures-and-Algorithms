import java.util.Scanner;

public class factorial {
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        int ans=fact(n-1);
        return ans* n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Give Number ");
        int n =sc.nextInt();
        int result=fact(n);
        System.out.println("The factorial of the given number is\t" + result);
    }
}
