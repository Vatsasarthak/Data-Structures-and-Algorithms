import java.util.*;

public class LeftRotate {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if (n == 0) return;

        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Give the Value of the K");
        int k = sc.nextInt();
        k = k % n;

        int[] temp = new int[n];

        for (int i = 0; i < n; i++) {
            temp[(i - k + n) % n] = num[i];
        }

        for(int i = 0; i < n; i++){
            num[i] = temp[i];
        }

        for(int i = 0; i < n; i++){
            System.out.print(num[i] + " ");
        }
    }
}