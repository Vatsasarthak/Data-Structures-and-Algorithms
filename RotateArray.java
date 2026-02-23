import java.util.*;

public class RotateArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Give me the value of the k");
        int k = sc.nextInt();
        if (n == 0) return;
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }
        int[] temp = new int[n];
        k = k % n;
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = num[i];
        }
        for (int i = 0; i < n; i++) {
            num[i] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(num[i] + " ");
        }
    }
}